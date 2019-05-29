package com.hsd.mapper;

import com.hsd.model.RDeviceInfor;

public interface RDeviceInforMapper {
    int deleteByPrimaryKey(Integer deviceinforid);

    int insert(RDeviceInfor record);

    int insertSelective(RDeviceInfor record);

    RDeviceInfor selectByPrimaryKey(Integer deviceinforid);

    int updateByPrimaryKeySelective(RDeviceInfor record);

    int updateByPrimaryKey(RDeviceInfor record);
}