package com.wanyu.learn.service.impl;

import com.wanyu.learn.dao.UserTMapper;
import com.wanyu.learn.domain.UserT;
import com.wanyu.learn.service.IUserTService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/4/28.
 */

@Service("userTService")
public class UserTServiceImpl implements IUserTService {

    @Resource
    private UserTMapper userTMapper;

    public UserT getUserTById(int id) {
        UserT userT =userTMapper.selectByPrimaryKey(id);
        return userT;
    }
}
