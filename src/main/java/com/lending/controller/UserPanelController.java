package com.lending.controller;

import com.lending.dto.*;
import com.lending.entities.Address;
import com.lending.entities.Person;
import com.lending.entities.Resource;
import com.lending.entities.ResourceType;
import com.lending.repositories.AddressRepository;
import com.lending.repositories.ResourceRepository;
import com.lending.repositories.ResourceTypeRepository;
import com.lending.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Controller
@RequestMapping(value = {"/moje-konto"})
public class UserPanelController {

    @Autowired
    public UserRepository userRepository;

    @Autowired
    public ResourceTypeRepository resourceTypeRepository;

    @Autowired
    public ResourceRepository resourceRepository;

    @Autowired
    AddressRepository addressRepository;

    private List<CategoriesDto> categories = null;

    @GetMapping(value="")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/borrow-panel");
        //initializeCategories();
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
        int userId = getLoggedUserId();
        List<UsersProductDto> borrowedProducts = resourceRepository.getProductsBorrowedByUser(userId);
        modelAndView.addObject("borrowedProducts", borrowedProducts);
        List<UsersProductDto> archivedProducts = resourceRepository.getArchiveProductsBorrowedByUser(userId);
        modelAndView.addObject("archivedProducts", archivedProducts);
        modelAndView.setViewName("user-panel/user-borrowed-products");
        return modelAndView;
    }

    @RequestMapping(value="/moje-produkty", method = RequestMethod.GET)
    public ModelAndView products() {
        return getUsersProductView(false);
    }

    @DeleteMapping(value="/moje-produkty")
    public ModelAndView productsDeleteItem(@RequestParam int item) {
        Resource resourceToDelete = resourceRepository.getResourceById(item);
        resourceToDelete.setDeleted(true);
        resourceRepository.save(resourceToDelete);
        return getUsersProductView(true);
    }

    @DeleteMapping(value="/moje-produkty/selected")
    public ModelAndView productsDeleteMultipleItems(@RequestParam(value = "itemsArray[]") Integer[] itemsArray) {
        List<Resource> resourcesToDelete = resourceRepository.getResourcesByIds(itemsArray);
        for (Resource r : resourcesToDelete) {
            r.setDeleted(true);
        }
        resourceRepository.saveAll(resourcesToDelete);
        return getUsersProductView(true);
    }

    @GetMapping(value="/edytuj-dane")
    public ModelAndView myData() {
        ModelAndView modelAndView = new ModelAndView();
        int userId = getLoggedUserId();
        UserInfoDto user = userRepository.getUserInfoById(userId);
        modelAndView.setViewName("user-panel/user-edit-data");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @PostMapping("/edytuj-dane")
    public ModelAndView myDataSubmit(@ModelAttribute UserInfoDto userInfo) throws InterruptedException {
        ModelAndView modelAndView = new ModelAndView();
        int userId = getLoggedUserId();
        Person user = userRepository.getUserById(userId);
        user.setFirstName(userInfo.getFirstName());
        user.setLastName(userInfo.getLastName());
        user.setBirthDate(userInfo.getBirthDate());
        Address address = addressRepository.getAddressesByUserId(userId);
        address.setZipCode(userInfo.getZipCode());
        address.setLocality(userInfo.getLocality());
        address.setStreet(userInfo.getStreet());
        address.setNrHouse(userInfo.getNrHouse());
        address.setNrFlat(userInfo.getNrFlat());
        userRepository.save(user);
        addressRepository.save(address);
        //time to show toast
        Thread.sleep(2000);
        modelAndView.setViewName("user-panel/user-panel");
        return modelAndView;
    }

    @GetMapping(value="/zmien-haslo")
    public ModelAndView editPassword() {
        ModelAndView modelAndView = new ModelAndView();
        UserPasswordInfoDto userPasswordInfo = new UserPasswordInfoDto();
        modelAndView.addObject("passwordInfo", userPasswordInfo);
        modelAndView.setViewName("user-panel/user-edit-password");
        return modelAndView;
    }

    @PostMapping(value="/zmien-haslo")
    public ModelAndView editPasswordSubmit(@ModelAttribute UserPasswordInfoDto passwordInfo) throws InterruptedException {
        ModelAndView modelAndView = new ModelAndView();
        String email = getLoggedUserEmail();
        System.out.println(passwordInfo.getOldPassword());
        if (userRepository.checkIfCredentialsAreCorrect(email, passwordInfo.getOldPassword())) {
            if (passwordInfo.checkIfNewPasswordsMatch()) {
                if (passwordInfo.checkIfOldAndNewAreDifferent()) {
                    int userId = getLoggedUserId();
                    Person user = userRepository.getUserById(userId);
                    user.setPassword(passwordInfo.getNewPassword());
                    userRepository.save(user);
                    //time to show toast
                    Thread.sleep(2000);
                }
            }
        }
        else {
            System.out.println("Stare hasło jest nieprawidłowe");
            //TODO: old password is incorrect info
        }
        modelAndView.setViewName("user-panel/user-panel");
        return modelAndView;
    }


    @GetMapping(value="/szukaj")
    public ModelAndView search(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView();
        initializeCategories();
        modelAndView.addObject("categories", categories);
        //List<Resource> availableResources = resourceRepository.getAvailableResourcesWithHighestCategory(id);
        List<Resource> availableResources = resourceRepository.getAvailableResourcesHighestCatNotUser(id, getLoggedUserId());
        List<String> images = new ArrayList<>(availableResources.size());
        for (Resource r : availableResources) {
            List<String> photosScr = getPhotosSrc(r.getId());
            images.add(photosScr.size() > 0 ? photosScr.get(0) : null);
        }
        modelAndView.addObject("availableResources", availableResources);
        modelAndView.addObject("images", images);
        modelAndView.setViewName("user-panel/category2");
        return modelAndView;
    }

    @GetMapping(value="/info-produktu")
    public ModelAndView productInfo(@RequestParam int item) {
        return getProductView(item, false);
    }

    @DeleteMapping(value="/info-produktu")
    public ModelAndView productInfoDelete(@RequestParam int item) {
        Resource resourceToDelete = resourceRepository.getResourceById(item);
        resourceToDelete.setDeleted(true);
        resourceRepository.save(resourceToDelete);
        //todo: success dialog/popup
        return products();
    }

    @GetMapping(value="/info-produktu/edycja-produktu")
    @ResponseBody
    public ResourceToEditDto productInfoEdit(Integer id) {
        Resource resource = resourceRepository.getResourceById(id);
        return new ResourceToEditDto(id, resource.getName(), resource.getResourceType().getName(),
                resource.getDescription(), getPhotosSrc(id));
    }

    @PostMapping(value="/info-produktu/edycja")
    public ModelAndView productInfoEditDone(@RequestParam(value = "info[]") String[] info) {
        System.out.println("xd");
        int item = Integer.parseInt(info[0]);
        String name = info[1];
        ResourceType category = resourceTypeRepository.getCategoryByName(info[2]);
        String desc = info[3];
        Resource resourceToEdit = resourceRepository.getResourceById(item);
        resourceToEdit.setName(name);
        resourceToEdit.setResourceType(category);
        resourceToEdit.setDescription(desc);
        resourceRepository.save(resourceToEdit);
        //todo fix refresh?
        //todo: update images in db and on dialog
        //todo: popup
        return getProductView(item, true);
    }

    @GetMapping(value="/info-wypozyczonego-produktu")
    public ModelAndView productInfoBorrowed(@RequestParam int item) {
        ModelAndView modelAndView = initializeModelAndViewForProductDetails(item);
        modelAndView.setViewName("user-panel/user-product-info-borrowed");
        return modelAndView;
    }

    @GetMapping(value="/szczegoly")
    public ModelAndView productDetails(@RequestParam int item) {
        ModelAndView modelAndView = initializeModelAndViewForProductDetails(item);
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

    @GetMapping(value="/info-szczegoly-zamowienia")
    public ModelAndView infoOrderDetails() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-order-details");
        return modelAndView;
    }

    private void initializeCategories() {
        categories = resourceTypeRepository.getHigherLevelTypes();
        for (CategoriesDto highestLevel : categories) {
            highestLevel.setSubcategories(resourceTypeRepository.getSubcategories(highestLevel.getHigherLevelType().getId()));
            for (CategoriesDto firstLevelSub : highestLevel.getSubcategories()) {
                firstLevelSub.setSubcategories(resourceTypeRepository.getSubcategories(firstLevelSub.getHigherLevelType().getId()));
                for (CategoriesDto secondLevelSub : firstLevelSub.getSubcategories())
                    secondLevelSub.setSubcategories(resourceTypeRepository.getSubcategories(secondLevelSub.getHigherLevelType().getId()));
            }
        }
    }

    private ModelAndView initializeModelAndViewForProductDetails(int item) {
        ModelAndView modelAndView = new ModelAndView();
        ResourceDetailsDto resource = resourceRepository.getProductDetails(item);
        List<ResourceRentingHistoryDto> history = resourceRepository.getProductRentingHistory(item);
        BorrowingUserInfoDto borrowingUser = resourceRepository.getGivingUserInfo(item);
        List<String> photosSrc = getPhotosSrc(item);
        modelAndView.addObject("item", resource);
        modelAndView.addObject("history", history);
        modelAndView.addObject("borrowingUser", borrowingUser);
        modelAndView.addObject("hasPhoto", photosSrc.size() > 0);
        modelAndView.addObject("photo", photosSrc.size() > 0 ? photosSrc.get(0) : null);
        return modelAndView;
    }

    private int getLoggedUserId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUser = authentication.getName();
        return userRepository.getUserIdByEmail(currentUser);
    }

    private String getLoggedUserEmail() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

    private ModelAndView getUsersProductView(boolean refresh) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-products");
        int userId = getLoggedUserId();
        List<UsersProductDto> products = userRepository.getUsersProducts(userId);
        List<UsersProductDto> archiveProducts = userRepository.getArchiveUsersProducts(userId);
        modelAndView.addObject("ProductsList", products);
        modelAndView.addObject("ArchiveProductsList", archiveProducts);
        modelAndView.addObject("refreshNeeded", refresh);
        return modelAndView;
    }

    private ModelAndView getProductView(int id, boolean refresh) {
        ModelAndView modelAndView = initializeModelAndViewForProductDetails(id);
        if (categories == null)
            initializeCategories();
        modelAndView.addObject("categories", categories);
        modelAndView.setViewName("user-panel/user-product-info");
        modelAndView.addObject("refreshNeeded", refresh);
        return modelAndView;
    }

    private List<String> getPhotosSrc (int id) {
        List<Blob> photos = resourceRepository.getPhotosOfResource(id);
        List<String> photoSrcs = new ArrayList<>(3);
        for (Blob blob : photos) {
            try {
                byte[] photoBytes = blob.getBytes(1l, (int) blob.length());
                Base64.Encoder encoder = Base64.getEncoder();
                photoSrcs.add("data:image/png;base64," + encoder.encodeToString(photoBytes));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return photoSrcs;
    }

}
