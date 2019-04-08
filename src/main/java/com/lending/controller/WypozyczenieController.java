package com.lending.controller;

import com.lending.entities.ResourceRenting;
import com.lending.repositories.UzytkownikRepository;
import com.lending.repositories.ResourceRepository;
import com.lending.services.ResourceRentingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value = "")
public class WypozyczenieController {

    @Autowired
    ResourceRentingService resourceRentingService;
    @Autowired
    UzytkownikRepository uzytkownikRepository;
    @Autowired
    ResourceRepository resourceRepository;

    @RequestMapping(value = "/wypozyczenieCreate", method=GET)
    @ResponseBody
    public String wypozyczenieCreate(){
        resourceRentingService.createWypozyczenie(
                uzytkownikRepository.findById(1).get(),
                uzytkownikRepository.findById(2).get(),
                resourceRepository.findById(1).get());
        return "created";
    }

    @RequestMapping(value = "/wypozyczenieGet", method = GET)
    @ResponseBody
    public String wypozyczenieGet(){
        ResourceRenting resourceRenting = resourceRentingService.getWypozyczenie(0);
        return resourceRenting.toString();
    }

}
