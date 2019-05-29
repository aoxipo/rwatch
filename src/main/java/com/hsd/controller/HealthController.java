package com.hsd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/health")
public class HealthController {
     
    
    /**
     * ����������ҳ��
     */
    @RequestMapping(value ="list")
    public String list(){
        
        return "health/list";
        
    }
    
    /**
     * ���豸�б�ҳ��
     */
    @RequestMapping(value ="deviceList")
    public String deviceList(){
        
        return "health/deviceList";
        
    }
    
    
}
