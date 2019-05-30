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
    private CommentService commentService;
    
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
        List<Map<String, Object>> list1 = commentService.listInfor();
        List<Map<String, Object>> list = commentService.listPageInfor(s,e);
        MapListToList t=new MapListToList();
        List<Infor> inforList=t.toList(list);
        JSONArray ar=JSONArray.fromObject(inforList);
        System.out.println(ar);
        Map<String, Object> result = new HashMap();
        result.put("code", 0);
        result.put("msg", "");
        result.put("count",list1.size() );
        result.put("data", ar);
        // 将其转换为JSON数据，并压入值栈返回
         j=JSONObject.fromObject(result);
         return j.toString();    
     }
    @RequestMapping("/position")    
    public ModelAndView toPosition(HttpSession session){
        ModelAndView mav = new ModelAndView("position_list");   
        List<Map<String, Object>> list = commentService.listPosition();
        mav.addObject("list", list);
        return mav;    
    }
  
}
