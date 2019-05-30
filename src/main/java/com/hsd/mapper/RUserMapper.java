package com.hsd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hsd.model.RUser;

public interface RUserMapper {
    public int deleteByPrimaryKey(Integer userId);

    public int insert(RUser record);

    public int insertSelective(RUser record);

    public RUser selectByPrimaryKey(Integer userId);

    public int updateByPrimaryKeySelective(RUser record);

    public int updateByPrimaryKey(RUser record);
    
    public List<RUser> findAllUser();

    public List<RUser> findAllUserPage(@Param(value="s")int s,
            @Param(value="e")int e);
}