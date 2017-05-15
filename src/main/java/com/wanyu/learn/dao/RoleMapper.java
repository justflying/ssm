package com.wanyu.learn.dao;

import com.wanyu.learn.domain.Role;

public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);
}