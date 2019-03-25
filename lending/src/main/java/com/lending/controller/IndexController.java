package com.lending.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping(value="/")
    public String index(){
        return "index";
    }
    @RequestMapping(value="/kontakt")
    public String contact(){
        return "kontakt";
    }
    @RequestMapping(value="/logowanie")
    public String login(){
        return "logowanie";
    }
}
