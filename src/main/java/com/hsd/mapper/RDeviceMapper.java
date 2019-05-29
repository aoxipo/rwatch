package com.hsd.mapper;

import com.hsd.model.RDevice;

public interface RDeviceMapper {
    int deleteByPrimaryKey(Integer deviceid);

    int insert(RDevice record);

    int insertSelective(RDevice record);

    RDevice selectByPrimaryKey(Integer deviceid);

    int updateByPrimaryKeySelective(RDevice record);

    int updateByPrimaryKey(RDevice record);
}