package com.lending.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = {""})
public class HomeController {
    @GetMapping(value="")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;

    }

    @GetMapping(value="/kontakt")
    public ModelAndView contact(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("contact-us");
        return modelAndView;
    }

    @GetMapping(value="/zaloguj")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }
}
