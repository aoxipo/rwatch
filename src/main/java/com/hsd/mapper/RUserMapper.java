package com.hsd.mapper;

import com.hsd.model.RUser;

public interface RUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(RUser record);

    int insertSelective(RUser record);

    RUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(RUser record);

    int updateByPrimaryKey(RUser record);
}