package com.hsd.mapper;

import com.hsd.model.RDevice;

import java.util.List;

public interface RDeviceMapper {
    int deleteByPrimaryKey(Integer deviceid);

    int insert(RDevice record);

    int insertSelective(RDevice record);

    RDevice selectByPrimaryKey(Integer deviceid);

    int updateByPrimaryKeySelective(RDevice record);

    int updateByPrimaryKey(RDevice record);
    List<RDevice>GetDeviceList();
    List<RDevice>MultiTableq();
    List<RDevice>MultiTableqBymemberName(String membername);
}