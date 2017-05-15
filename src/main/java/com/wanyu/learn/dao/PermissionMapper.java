package com.wanyu.learn.dao;

import com.wanyu.learn.domain.Permission;

public interface PermissionMapper {
    int insert(Permission record);

    int insertSelective(Permission record);
}