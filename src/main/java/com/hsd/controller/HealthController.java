package com.hsd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/health")
public class HealthController {
     
    
    /**
     * 到健康数据页面
     */
    @RequestMapping(value ="list")
    public String list(){
        
        return "health/list";
        
    }
    
    /**
     * 到设备列表页面
     */
    @RequestMapping(value ="deviceList")
    public String deviceList(){
        
        return "health/deviceList";
        
    }
    
    
}
