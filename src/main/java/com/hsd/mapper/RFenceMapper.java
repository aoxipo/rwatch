package com.hsd.mapper;

import com.hsd.model.RFence;

public interface RFenceMapper {
    int deleteByPrimaryKey(Integer fenceid);

    int insert(RFence record);

    int insertSelective(RFence record);

    RFence selectByPrimaryKey(Integer fenceid);

    int updateByPrimaryKeySelective(RFence record);

    int updateByPrimaryKey(RFence record);
}