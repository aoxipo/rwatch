package com.hsd.model;

import java.util.Date;

public class RDeviceInfor {
    private Integer deviceinforid;

    private Integer bydeviceid;

    private String state;

    private Double x;

    private Double y;

    private Integer power;

    private Date time;

    private Integer flag;

    public Integer getDeviceinforid() {
        return deviceinforid;
    }

    public void setDeviceinforid(Integer deviceinforid) {
        this.deviceinforid = deviceinforid;
    }

    public Integer getBydeviceid() {
        return bydeviceid;
    }

    public void setBydeviceid(Integer bydeviceid) {
        this.bydeviceid = bydeviceid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}