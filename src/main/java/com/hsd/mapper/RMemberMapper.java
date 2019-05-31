package com.hsd.mapper;

import com.hsd.model.RMember;

import java.util.List;

public interface RMemberMapper {
    int insert(RMember record);

    int insertSelective(RMember record);
    int updateByPrimaryKeySelective(RMember record);
    List<RMember> GetALLList();
}