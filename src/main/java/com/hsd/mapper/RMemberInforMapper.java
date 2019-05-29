package com.hsd.mapper;

import com.hsd.model.RMemberInfor;

public interface RMemberInforMapper {
    int deleteByPrimaryKey(Integer memberinforid);

    int insert(RMemberInfor record);

    int insertSelective(RMemberInfor record);

    RMemberInfor selectByPrimaryKey(Integer memberinforid);

    int updateByPrimaryKeySelective(RMemberInfor record);

    int updateByPrimaryKey(RMemberInfor record);
}