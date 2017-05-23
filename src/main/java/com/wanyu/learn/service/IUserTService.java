package com.wanyu.learn.service;

import com.wanyu.learn.domain.User;

import java.util.Set;

/**
 * Created by Administrator on 2017/4/28.
 */
public interface IUserTService {
   User findUserByUsername(String username);
   Set<String> findRoles(String username);
   Set<String> findPermissions(String username);
}
