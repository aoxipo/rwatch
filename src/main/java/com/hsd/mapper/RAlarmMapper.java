package com.hsd.mapper;

import com.hsd.model.RAlarm;

public interface RAlarmMapper {
    int deleteByPrimaryKey(Integer alarmid);

    int insert(RAlarm record);

    int insertSelective(RAlarm record);

    RAlarm selectByPrimaryKey(Integer alarmid);

    int updateByPrimaryKeySelective(RAlarm record);

    int updateByPrimaryKey(RAlarm record);
}