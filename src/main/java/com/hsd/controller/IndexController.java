package com.hsd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    /**
     * 到login页面
     */
    @RequestMapping("")
//    public void redirect(HttpServletResponse response) throws IOException{
//        //TODO 可能涉及的业务代码，根据业务确定跳转页面
//
//        response.sendRedirect("//login");
//    }
    public String rtulogin(){
        return "redirect:/login";
    }



}
