package com.lending.controller;

import com.lending.dto.CategoriesDto;
import com.lending.dto.ResourceDetailsDto;
import com.lending.dto.ResourceRentingHistoryDto;
import com.lending.dto.UsersProductDto;
import com.lending.entities.ResourceType;
import com.lending.repositories.ResourceRepository;
import com.lending.repositories.ResourceTypeRepository;
import com.lending.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = {"/moje-konto"})
public class UserPanelController {
//    @Autowired
//    public ResourceRepository resourceRepository;
//
    @Autowired
    public UserRepository userRepository;

    @Autowired
    public ResourceTypeRepository resourceTypeRepository;

    @Autowired
    public ResourceRepository resourceRepository;
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
        modelAndView.setViewName("user-panel/borrow-panel");
        return modelAndView;

    }

    @GetMapping(value="/kontakt")
    public ModelAndView contact(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/contact-us");
        return modelAndView;
    }

    @GetMapping(value="/powiadomienia")
    public ModelAndView alerts() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-alerts");
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

        return "user-panel/user-panel";
    }

    @GetMapping(value="/moje-statystyki")
    public ModelAndView stats() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-stats");
        return modelAndView;
    }

    @GetMapping(value="/moje-punkty")
    public ModelAndView points() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-points");
        return modelAndView;
    }

    @GetMapping(value="/dodaj-produkt")
    public ModelAndView addProduct() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-add-product");
        return modelAndView;
    }

    @GetMapping(value="/edytuj-produkt")
    public ModelAndView editProduct() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-edit-product");
        return modelAndView;
    }

    @GetMapping(value="/usun-produkt")
    public ModelAndView deleteProduct() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-delete-product");
        return modelAndView;
    }

    @GetMapping(value="/zwroc-produkt")
    public ModelAndView backProduct() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-back-product");
        return modelAndView;
    }

    @GetMapping(value="/wypozyczone-produkty")
    public ModelAndView borrowedProduct() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-borrowed-products");
        return modelAndView;
    }

    @RequestMapping(value="/moje-produkty", method = RequestMethod.GET)
    public ModelAndView products() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-products");
        List<UsersProductDto> products = userRepository.getUsersProducts(3);
        List<UsersProductDto> archiveProducts = userRepository.getArchiveUsersProducts(3);
        modelAndView.addObject("ProductsList", products);
        modelAndView.addObject("ArchiveProductsList", archiveProducts);
        return modelAndView;
    }

    @GetMapping(value="/edytuj-dane")
    public ModelAndView myData() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-edit-data");
        return modelAndView;
    }

    @GetMapping(value="/zmien-haslo")
    public ModelAndView editPassword() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-edit-password");
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

    @GetMapping(value="/szukaj")
    public ModelAndView search(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView();
        List<ResourceType> higherLevels = resourceTypeRepository.getHigherLevelTypes();
        List<CategoriesDto> categories = new ArrayList<>(9);
        CategoriesDto dto;
        List<ResourceType> subcategories;
        for (ResourceType parent : higherLevels) {
            subcategories = resourceTypeRepository.getSubcategories(parent.getId());
            dto = new CategoriesDto(parent, subcategories);
            categories.add(dto);
        }
        modelAndView.addObject("categories", categories);
        modelAndView.setViewName("user-panel/category2");
        return modelAndView;
    }

    @GetMapping(value="/moje-produkty/szczegoly-produktu")
    public ModelAndView product(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView();

        return modelAndView;
    }

    @GetMapping(value="/szczegoly")
    public ModelAndView productDetails(@RequestParam int item) {
        ModelAndView modelAndView = new ModelAndView();
        ResourceDetailsDto resource = resourceRepository.getProductDetails(item);
        List<ResourceRentingHistoryDto> history = resourceRepository.getProductRentingHistory(item);
        modelAndView.addObject("item", resource);
        modelAndView.addObject("history", history);
        modelAndView.setViewName("user-panel/product-details");
        return modelAndView;
    }

    @GetMapping(value="/wypozycz")
    public ModelAndView productBorrow() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/product-borrow");
        return modelAndView;
    }

    @GetMapping(value="/potwierdzenie-zamowienia")
    public ModelAndView orderDetails() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/order-details");
        return modelAndView;
    }
}
