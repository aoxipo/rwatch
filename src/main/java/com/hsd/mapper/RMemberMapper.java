package com.hsd.mapper;

import com.hsd.model.RMember;

public interface RMemberMapper {
    int insert(RMember record);

    int insertSelective(RMember record);
}