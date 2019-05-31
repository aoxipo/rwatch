package com.hsd.model;

import java.util.Date;
import java.util.List;

public class RDevice {
    private Integer deviceid;

    private Integer bymemberid;

    private String name;

    private String devicename;
    private Date stime;

    private Date etime;

    private Integer flag;

    private RMember user;

    private List<RDeviceInfor> infor;


    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }


    public RMember getUser(){return user;}
    public void setUser(){
        this.user=user;
    }
    public List<RDeviceInfor> getInfor(){return infor;};

    public void setInfor(List<RDeviceInfor> infor){
        this.infor=infor;
    }

    public Integer getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    public Integer getBymemberid() {
        return bymemberid;
    }

    public void setBymemberid(Integer bymemberid) {
        this.bymemberid = bymemberid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}