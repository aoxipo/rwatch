package com.hsd.model;

import java.util.Date;

public class Infor {
    private String type;
    private String name;
    private String time;
    private String ontime;
    private String ByMemberId;
    private String state;
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getTime() {
        return time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    
    public String getOntime() {
        return ontime;
    }
    
    public void setOntime(String ontime) {
        this.ontime = ontime;
    }
    
    public String getByMemberId() {
        return ByMemberId;
    }
    
    public void setByMemberId(String byMemberId) {
        ByMemberId = byMemberId;
    }
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
}
