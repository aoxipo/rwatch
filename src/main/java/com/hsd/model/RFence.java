package com.hsd.model;

import java.util.Date;

public class RFence {
    private Integer fenceid;

    private Integer bydevice;

    private Integer bymember;

    private Double x;

    private Double y;

    private Double radius;

    private Date time;

    private Integer flag;

    public Integer getFenceid() {
        return fenceid;
    }

    public void setFenceid(Integer fenceid) {
        this.fenceid = fenceid;
    }

    public Integer getBydevice() {
        return bydevice;
    }

    public void setBydevice(Integer bydevice) {
        this.bydevice = bydevice;
    }

    public Integer getBymember() {
        return bymember;
    }

    public void setBymember(Integer bymember) {
        this.bymember = bymember;
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

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
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