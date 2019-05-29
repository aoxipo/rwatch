package com.hsd.model;

import java.util.Date;

public class RMemberInfor {
    private Integer memberinforid;

    private Integer bymemberid;

    private Double pressure;

    private Double heartrate;

    private Integer stepcount;

    private Integer sleeptime;

    private Integer bloodglucose;

    private Date time;

    private Integer flag;

    public Integer getMemberinforid() {
        return memberinforid;
    }

    public void setMemberinforid(Integer memberinforid) {
        this.memberinforid = memberinforid;
    }

    public Integer getBymemberid() {
        return bymemberid;
    }

    public void setBymemberid(Integer bymemberid) {
        this.bymemberid = bymemberid;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(Double heartrate) {
        this.heartrate = heartrate;
    }

    public Integer getStepcount() {
        return stepcount;
    }

    public void setStepcount(Integer stepcount) {
        this.stepcount = stepcount;
    }

    public Integer getSleeptime() {
        return sleeptime;
    }

    public void setSleeptime(Integer sleeptime) {
        this.sleeptime = sleeptime;
    }

    public Integer getBloodglucose() {
        return bloodglucose;
    }

    public void setBloodglucose(Integer bloodglucose) {
        this.bloodglucose = bloodglucose;
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