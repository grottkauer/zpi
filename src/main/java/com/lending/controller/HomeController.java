package com.lending.controller;

import com.lending.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "zaloguj", method = RequestMethod.POST)
    public String processLogIn(@RequestParam String email, @RequestParam String password)
    {
        boolean wasUserFound = false;
        int userId = Integer.MIN_VALUE;
        if (userRepository.checkIfUserExists(email)) {
            wasUserFound = userRepository.checkIfCredentialsAreCorrect(email, password);
            if (wasUserFound)
                userId = userRepository.getUserIdByEmail(email);
            // else show that password is incorrect
        }
        // else show that user was not found

        // add user id as parameter
        if (wasUserFound) {
            // Redirect to /user-panel
            return "redirect:/moje-konto";
        }
        return "redirect:/zaloguj";
    }
}
