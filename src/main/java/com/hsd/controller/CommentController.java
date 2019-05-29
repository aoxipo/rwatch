package com.hsd.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hsd.model.Infor;
import com.hsd.service.CommentService;
import com.hsd.util.MapListToList;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/Comment")
public class CommentController {
     
    @Autowired
    private CommentService CommentService;
    
    @RequestMapping("/toInforList")    
    public ModelAndView toCommentList(HttpSession session){      
        ModelAndView mav = new ModelAndView("infor_list");   
        return mav;    
    }
    @ResponseBody
    @RequestMapping(value="/inforList",method=RequestMethod.POST)    
     public String CommentList(HttpSession session,@RequestParam(value="page")int page,
             @RequestParam(value="limit")int limit){
        int s=0;
        int e=0;
        s=(page-1)*limit;
        e=limit;
        JSONObject j = new JSONObject();
        List<Map<String, Object>> list1 = CommentService.listInfor();
        List<Map<String, Object>> list = CommentService.listPageInfor(s,e);
        MapListToList t=new MapListToList();
        List<Infor> inforList=t.toList(list);
        /*List<Infor> inforList=new ArrayList();
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
            l=l.putAll(r);
            System.out.println(r);
        }*/
        JSONArray ar=JSONArray.fromObject(inforList);
        System.out.println(ar);
        Map<String, Object> result = new HashMap();
        result.put("code", 0);
        result.put("msg", "");
        result.put("count",list1.size() );
        /*JSONArray array = JSONArray.fromObject(list);*/
        
        result.put("data", ar);
        // 将其转换为JSON数据，并压入值栈返回
        
            
         j=JSONObject.fromObject(result);
         
         return j.toString();    
     }
    @RequestMapping("/toPosition")    
    public ModelAndView toPosition(HttpSession session){      
        ModelAndView mav = new ModelAndView("position");   
        return mav;    
    }
  
}
