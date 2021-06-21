package com.eagle.crm.service;

import com.eagle.crm.entity.User;

import java.util.List;

/**
 *  Service 的CRUD也不用写了
 */
public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}
