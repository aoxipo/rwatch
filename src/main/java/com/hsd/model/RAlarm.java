package com.hsd.model;

import java.util.Date;

public class RAlarm {
    private Integer alarmid;

    private String name;

    private String type;

    private Date time;

    private String adevicestate;

    private Integer flag;

    private Integer deviceid;

    public Integer getAlarmid() {
        return alarmid;
    }

    public void setAlarmid(Integer alarmid) {
        this.alarmid = alarmid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAdevicestate() {
        return adevicestate;
    }

    public void setAdevicestate(String adevicestate) {
        this.adevicestate = adevicestate == null ? null : adevicestate.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }
}