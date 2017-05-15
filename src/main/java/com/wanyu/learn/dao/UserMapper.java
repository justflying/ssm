package com.wanyu.learn.dao;

import com.wanyu.learn.domain.User;

import java.util.Set;

public interface UserMapper {
     User findUserByUsername(String userName);
     Set<String> findRoles(String userName);
     Set<String> findPermissions(String userName);
}