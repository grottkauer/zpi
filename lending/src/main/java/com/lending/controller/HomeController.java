package com.lending.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value="/")
    public String index(){
        return "index";
    }
    @RequestMapping(value="/contact-us")
    public String contact(){
        return "contact-us";
    }
    @RequestMapping(value="/login")
    public String login(){
        return "login";
    }
}
