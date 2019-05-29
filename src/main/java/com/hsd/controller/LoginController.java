package com.hsd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsd.model.User;
import com.hsd.service.UserService;
import com.hsd.util.AjaxJson;

@Controller
@RequestMapping("/login")
public class LoginController {
     
    @Autowired
    private UserService userService;
    
    /**
     * ��¼ҳ
     */
   
    @RequestMapping(value = {"index", ""})
    public String index(){
        
        return "index";
    }   
    
    
    
    /**
     * ��¼����
     */
    @RequestMapping(value ="doLogin", method = RequestMethod.POST)
    @ResponseBody
    public AjaxJson doLogin(String username, String password){
        
        AjaxJson j = new AjaxJson();
        
        User user = userService.findUser(username,password);
       
        if (user != null) {
            j.setSuccess(true);
        } else {
            j.setSuccess(false);
            j.setMsg("�˺Ż��������,������");
        }
       
        return j;
    }
    
    /**
     * ��ɵ�¼
     * @return
     */
    @RequestMapping(value = "login")
    public String login(){
        
        
        return "login";
    }
    
    @RequestMapping(value = "logout")
    public String logout(){
        
        
        return "redirect:/login/index";
    }  
}
