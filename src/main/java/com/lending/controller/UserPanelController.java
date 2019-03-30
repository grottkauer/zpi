package com.lending.controller;

import com.lending.ZasobService;
import com.lending.entities.RodzajZasobu;
import com.lending.entities.Zasob;
import com.lending.repositories.RodzajZasobuRepository;
import com.lending.repositories.ZasobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = {"/moje-konto"})
public class UserPanelController {
    @Autowired
    public ZasobRepository zasobRepository;

    @Autowired
    public RodzajZasobuRepository rodzajZasobuRepository;

    @RequestMapping("/db")
    @ResponseBody
    public String testMethod() {
        StringBuilder response = new StringBuilder();

        for(RodzajZasobu rodzajZasobu: rodzajZasobuRepository.findAll()) {
            response.append(rodzajZasobu).append("\n");
            for(Zasob task: rodzajZasobu.getZasoby()) {      // 1
                response.append("- ").append(task).append("\n");
            }
        }

        return response.toString();
    }

    @GetMapping(value="")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/index");
        return modelAndView;

    }

    @GetMapping(value="/kontakt")
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

    @GetMapping(value="/moje-dane")
    public ModelAndView mojeDane() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/my-account");
        return modelAndView;
    }
}
