package com.lending.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = {"/user"})
public class UserPanelController {
    @GetMapping(value="")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/index");
        return modelAndView;

    }

    @GetMapping(value="/contact-us")
    public ModelAndView contact(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/contact-us");
        return modelAndView;
    }

    @GetMapping(value="/panel")
    public ModelAndView panel() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-panel");
        return modelAndView;
    }
}