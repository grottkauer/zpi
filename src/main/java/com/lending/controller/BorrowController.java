package com.lending.controller;

import com.lending.entities.ResourceRenting;
import com.lending.repositories.ResourceRepository;
import com.lending.repositories.UserRepository;
import com.lending.services.ResourceRentingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "")
public class BorrowController {

    @Autowired
    ResourceRentingService resourceRentingService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ResourceRepository resourceRepository;

    @RequestMapping(value = "/wypozyczenieCreate")
    @ResponseBody
    public String wypozyczenieCreate(){
        resourceRentingService.createWypozyczenie(
                userRepository.findById(1).get(),
                userRepository.findById(2).get(),
                resourceRepository.findById(1).get());
        return "created";
    }

    @RequestMapping(value = "/wypozyczenieGet")
    @ResponseBody
    public String wypozyczenieGet(){
        ResourceRenting resourceRenting = resourceRentingService.getWypozyczenie(1);
        return resourceRenting.toString();
    }



}
