package com.wanyu.learn.service.impl;

import com.wanyu.learn.dao.UserMapper;
import com.wanyu.learn.domain.User;
import com.wanyu.learn.service.IUserTService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;


/**
 * Created by Administrator on 2017/4/28.
 */

@Service
public class UserTServiceImpl  implements IUserTService{
    @Resource
    private UserMapper userMapper;

    public User findUserByUsername(String username) {
        return userMapper.findUserByUsername(username);
    }

    public Set<String> findRoles(String username) {
        return userMapper.findRoles(username);
    }

    public Set<String> findPermissions(String username) {
        return userMapper.findPermissions(username);
    }
}
