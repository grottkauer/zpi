package com.lending.controller;

import com.lending.entities.ResourceType;
import com.lending.repositories.ResourceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = {"/moje-konto"})
public class UserPanelController {
//    @Autowired
//    public ResourceRepository resourceRepository;
//
    @Autowired
    public ResourceTypeRepository resourceTypeRepository;
//
//    @RequestMapping("/db")
//    @ResponseBody
//    public String testMethod() {
//        StringBuilder response = new StringBuilder();
//
//        for(ResourceType rodzajZasobu: resourceTypeRepository.findAll()) {
//            response.append(rodzajZasobu).append("\n");
//            for(Resource task: rodzajZasobu.getResources()) {      // 1
//                response.append("- ").append(task).append("\n");
//            }
//        }
//
//        return response.toString();
//    }

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

//    @GetMapping(value="/panel")
//    public ModelAndView panel() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("user-panel/user-panel");
//        return modelAndView;
//    }

    @GetMapping(value="/panel")
    public String panel(Model model) {
        Iterable<ResourceType> resourceTypes = resourceTypeRepository.findAll();
        model.addAttribute("resourceTypes", resourceTypes);

        return "user-panel/user-panel";
    }

    @GetMapping(value="/moje-dane")
    public ModelAndView mojeDane() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/my-account");
        return modelAndView;
    }

//    @GetMapping(value="/wypozyczenie")
//    public ModelAndView borrow() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("user-panel/borrow-panel");
//
//        return modelAndView;
//    }

    @GetMapping(value="/wypozyczenie")
    public String borrow(Model model) {
//        Iterable<ResourceType> resourceTypes = resourceTypeRepository.findAll();
//        model.addAttribute("resourceTypes", resourceTypes);

        return "user-panel/borrow-panel";
    }
}
