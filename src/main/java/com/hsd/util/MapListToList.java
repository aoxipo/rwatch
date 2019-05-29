package com.hsd.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hsd.model.Infor;

public class MapListToList {
    public List<Infor> toList(List<Map<String, Object>> list){
        List<Infor> inforList=new ArrayList();
        for(int i=0;i<list.size();i++){
            Map<String, Object> r = new HashMap<String, Object>();
            System.out.println(list.get(i));
            r=list.get(i);
            Infor infor=new Infor();
            infor.setName(String.valueOf(r.get("name")));
            infor.setByMemberId(String.valueOf(r.get("ByMemberId")));
            infor.setOntime(String.valueOf(r.get("Ontime")));
            infor.setState(String.valueOf(r.get("state")));
            infor.setTime(String.valueOf(r.get("time")));
            infor.setType(String.valueOf(r.get("type")));
            inforList.add(infor);
            /*l=l.putAll(r)*/;
            System.out.println(r);
        }
        
        return inforList;
    }
    
}
