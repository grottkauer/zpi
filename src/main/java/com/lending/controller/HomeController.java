package com.lending.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping(value="kontakt")
    public ModelAndView contact(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("contact-us");
        return modelAndView;
    }

    @RequestMapping(value = "zaloguj", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = "zaloguj", method = RequestMethod.POST)
    public String processLogiIn(@RequestParam String email,@RequestParam String password)
    {
        String simple_email = "natalia@wp.pl";
        String simple_passw = "kotelki";

        // TODO
        // connect with server and check if user is there if true -> return user if false -> communicate
        boolean is_account = simple_email.equals(email) && simple_passw.equals(password);

        if (is_account)
            // Redirect to /user-panel
            return "redirect:/moje-konto";
        return "redirect:zaloguj";
    }
}
