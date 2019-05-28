package com.lending.controller;

import com.lending.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping(value = {""})
public class HomeController {

    @Autowired
    UserRepository userRepository;

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

    @PostMapping(value = "rejestruj")
    public ModelAndView register(@RequestParam(value = "data[]") String[] data) {
        String email = data[0];
        String password = data[1];
        String firstName = data[2];
        String lastName = data[3];
        Date birthDate = new Date();
        try {
            birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(data[4]);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        String zipCode = data[5];
        String locality = data[6];
        String street = data[7];
        String nrHouse = data[8];
        String nrFlat = data[9];

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }



}
