package com.hsd.mapper;

import org.apache.ibatis.annotations.Param;

import com.hsd.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findUser(@Param(value="username")String username, @Param(value="password")String password);
}