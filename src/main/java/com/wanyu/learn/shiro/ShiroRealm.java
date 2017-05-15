package com.wanyu.learn.shiro;


import com.wanyu.learn.dao.UserMapper;
import com.wanyu.learn.domain.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;
import java.util.Set;

/**
 * Created by Administrator on 2017/5/11.
 */
public  class ShiroRealm extends AuthorizingRealm {

    @Resource
    private UserMapper userMapper;

    /**
     * 用于权限验证
     * @param principalCollection
     * @return
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username =principalCollection.getPrimaryPrincipal().toString();
        SimpleAuthorizationInfo info =new SimpleAuthorizationInfo();
        Set<String> roleName =userMapper.findRoles(username);
        Set<String> permissions =userMapper.findPermissions(username);
        info.setRoles(roleName);
        info.setStringPermissions(permissions);
        return info;
    }

    /**
     * 首先执行这个登陆认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取前台传来的账号
        String username = authenticationToken.getPrincipal().toString();
        User user =  userMapper.findUserByUsername(username);
        if(user !=null){
            Object principal = user.getUsername();
            Object credentials = this.getMD5Credentials(user.getPassword(),user.getUsername());
            ByteSource credentialsSalt = ByteSource.Util.bytes(user.getUsername());
            AuthenticationInfo authenticationInfo =null;
            authenticationInfo = new SimpleAuthenticationInfo(principal,credentials,credentialsSalt,getName());
            return authenticationInfo;
        }
        return null;
    }
    public Object getMD5Credentials(String credentials,String username){
        ByteSource salt = ByteSource.Util.bytes(username);
        String hashAlgorimName ="MD5";
        int hashIterations=1024;
        return new SimpleHash(hashAlgorimName,credentials,salt,hashIterations);
    }
}
