package com.lending.controller;

import com.lending.dto.*;
import com.lending.entities.*;
import com.lending.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
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

    @Autowired
    ImageRepository imageRepository;

    private List<CategoriesDto> categories = null;

    @GetMapping(value="")
    public ModelAndView index() {
        return getBorrowPanel();

    }

    @GetMapping(value="/kontakt")
    public ModelAndView contact(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/contact-us");
        //modelAndView.addObject("userName", getUserPseudo());
        return modelAndView;
    }

    @GetMapping(value="/powiadomienia")
    public ModelAndView alerts() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-alerts");
        modelAndView.addObject("userName", getUserPseudo());
        return modelAndView;

    }

    @GetMapping(value="/panel")
    public String panel(Model model) {

        return "user-panel/user-panel";
    }

    @GetMapping(value="/moje-statystyki")
    public ModelAndView stats() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userName", getUserPseudo());
        modelAndView.setViewName("user-panel/user-stats");
        return modelAndView;
    }

    @GetMapping(value="/moje-punkty")
    public ModelAndView points() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userName", getUserPseudo());
        modelAndView.setViewName("user-panel/user-points");
        return modelAndView;
    }

    @GetMapping(value="/dodaj-produkt")
    public ModelAndView addProduct() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userName", getUserPseudo());
        modelAndView.setViewName("user-panel/user-add-product");
        if (categories == null)
            initializeCategories();
        modelAndView.addObject("categories", categories);
        return modelAndView;
    }

    @PostMapping(value="/dodaj-produkt/dodaj")
    public ModelAndView addProductDone(@RequestParam(value = "info[]") String[] info,
                                       @RequestParam(value = "images[]", required = false) String[] images) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userName", getUserPseudo());
        modelAndView.setViewName("user-panel/borrow-panel");
        String name = info[0];
        ResourceType category = resourceTypeRepository.getCategoryById(Integer.parseInt(info[1])).getHigherLevelType();
        String desc = info[2];
        int coins = Integer.parseInt(info[3]);
        Person owner = userRepository.getUserById(getLoggedUserId());
        Date date = new Date();
        Resource newResource = new Resource(coins, name, desc, category, owner, date, true, false);
        resourceRepository.save(newResource);
        addImagesToResource(newResource.getId(), images);
        //todo popup
        return modelAndView;
    }

    @GetMapping(value="/edytuj-produkt")
    public ModelAndView editProduct() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-edit-product");
        modelAndView.addObject("userName", getUserPseudo());
        return modelAndView;
    }

    @GetMapping(value="/usun-produkt")
    public ModelAndView deleteProduct() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-delete-product");
        modelAndView.addObject("userName", getUserPseudo());
        return modelAndView;
    }

    @GetMapping(value="/zwroc-produkt")
    public ModelAndView backProduct() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-back-product");
        modelAndView.addObject("userName", getUserPseudo());
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
        modelAndView.addObject("userName", getUserPseudo());
        return modelAndView;
    }

    @RequestMapping(value="/moje-produkty", method = RequestMethod.GET)
    public ModelAndView products() {
        return getUsersProductView(false);
    }

    @DeleteMapping(value="/moje-produkty")
    public ModelAndView productsDeleteItem(@RequestParam int item) {
        Resource resourceToDelete = resourceRepository.getResourceById(item);
        if (resourceToDelete.getOwner().getId() == getLoggedUserId()) {
            resourceToDelete.setDeleted(true);
            resourceRepository.save(resourceToDelete);
            //todo: popup
            return getUsersProductView(true);
        }
        else
            return getBorrowPanel();
    }

    @DeleteMapping(value="/moje-produkty/selected")
    public ModelAndView productsDeleteMultipleItems(@RequestParam(value = "itemsArray[]") Integer[] itemsArray) {
        List<Resource> resourcesToDelete = resourceRepository.getResourcesByIds(itemsArray);
        if (resourcesToDelete.size() > 0 && resourcesToDelete.get(0).getOwner().getId() != getLoggedUserId())
            return getBorrowPanel();
        for (Resource r : resourcesToDelete) {
            r.setDeleted(true);
        }
        resourceRepository.saveAll(resourcesToDelete);
        //todo: popup
        return getUsersProductView(true);
    }

    @GetMapping(value="/edytuj-dane")
    public ModelAndView myData() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userName", getUserPseudo());
        int userId = getLoggedUserId();
        UserInfoDto user = userRepository.getUserInfoById(userId);
        modelAndView.setViewName("user-panel/user-edit-data");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @PostMapping("/edytuj-dane")
    public ModelAndView myDataSubmit(@ModelAttribute UserInfoDto userInfo) throws InterruptedException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userName", getUserPseudo());
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
        modelAndView.addObject("userName", getUserPseudo());
        return modelAndView;
    }

    @PostMapping(value="/zmien-haslo")
    public ModelAndView editPasswordSubmit(@ModelAttribute UserPasswordInfoDto passwordInfo) throws InterruptedException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userName", getUserPseudo());
        String email = getLoggedUserEmail();
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
        modelAndView.addObject("userName", getUserPseudo());
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
        modelAndView.addObject("userCoins", userRepository.getUserCoins(getLoggedUserId()));
        modelAndView.setViewName("user-panel/category2");
        return modelAndView;
    }

    @GetMapping(value="/info-produktu")
    public ModelAndView productInfo(@RequestParam int item) {
        return getProductView(item, false);
    }

    @DeleteMapping(value="/info-produktu")
    public ModelAndView productInfoDelete(@RequestParam int item) throws InterruptedException {
        Resource resourceToDelete = resourceRepository.getResourceById(item);
        if (resourceToDelete.getOwner().getId() != getLoggedUserId())
            return getBorrowPanel();
        resourceToDelete.setDeleted(true);
        resourceRepository.save(resourceToDelete);
        Thread.sleep(500);
        return products();
    }

    @GetMapping(value="/info-produktu/edycja-produktu/")
    @ResponseBody
    public ResourceToEditDto productInfoEdit(Integer id) {
        Resource resource = resourceRepository.getResourceById(id);
        return new ResourceToEditDto(id, resource.getName(), resource.getResourceType().getId(),
                resource.getDescription(), resource.getPoints(), getPhotosSrc(id),
                imageRepository.getPhotosIdsOfResource(id));
    }

    @PostMapping(value="/info-produktu/edycja")
    public ModelAndView productInfoEditDone(@RequestParam(value = "info[]") String[] info,
                                            @RequestParam(value = "images[]", required = false) String[] images,
                                            @RequestParam(value = "toDelete[]", required = false) Integer[] toDelete) {
        if (resourceRepository.getOwnerOfResource(Integer.parseInt(info[0])) != getLoggedUserId())
            return getBorrowPanel();
        editResource(info);
        addImagesToResource(Integer.parseInt(info[0]),images);
        removeImagesFromResource(toDelete);
        //todo: popup
        return getProductView(Integer.parseInt(info[0]), true);
    }

    @PostMapping(value="/moje-produkty/edycja")
    public ModelAndView productEditDone(@RequestParam(value = "info[]") String[] info,
                                        @RequestParam(value = "images[]", required = false) String[] images,
                                        @RequestParam(value = "toDelete[]", required = false) Integer[] toDelete) {
        if (resourceRepository.getOwnerOfResource(Integer.parseInt(info[0])) != getLoggedUserId())
            return getBorrowPanel();
        editResource(info);
        addImagesToResource(Integer.parseInt(info[0]),images);
        removeImagesFromResource(toDelete);
        //todo: popup
        return getUsersProductView(true);
    }

    @PostMapping(value = "/moje-produkty/do-wypozyczenia")
    public ModelAndView productToBorrowClicked(@RequestParam(value = "item") int item,
                                               @RequestParam(value = "checked") boolean checked) {
        Resource resource = resourceRepository.getResourceById(item);
        if (resource.getOwner().getId() != getLoggedUserId())
            return getBorrowPanel();
        resource.setCanBeBorrowed(checked);
        resourceRepository.save(resource);
        //todo: popup
        return getUsersProductView(false);
    }

    @GetMapping(value="/info-wypozyczonego-produktu")
    public ModelAndView productInfoBorrowed(@RequestParam int item) {
        ModelAndView modelAndView = initializeModelAndViewForProductDetails(item);
        modelAndView.setViewName("user-panel/user-product-info-borrowed");
        modelAndView.addObject("userName", getUserPseudo());
        return modelAndView;
    }

    @GetMapping(value="/szczegoly")
    public ModelAndView productDetails(@RequestParam int item) {
        ModelAndView modelAndView = initializeModelAndViewForProductDetails(item);
        modelAndView.setViewName("user-panel/product-details");
        modelAndView.addObject("userName", getUserPseudo());
        modelAndView.addObject("userCoins", userRepository.getUserCoins(getLoggedUserId()));
        return modelAndView;
    }

    @GetMapping(value="/wypozycz")
    public ModelAndView productBorrow(@RequestParam int item) {
        ModelAndView modelAndView = initializeModelAndViewForProductDetails(item);
        modelAndView.setViewName("user-panel/product-borrow");
        modelAndView.addObject("userName", getUserPseudo());
        if (userRepository.getUserCoins(getLoggedUserId()) < resourceRepository.getPriceOfResource(item))
            return productDetails(item);
        return modelAndView;
    }

    @GetMapping(value="/potwierdzenie-zamowienia")
    public ModelAndView orderDetails() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/order-details");
        modelAndView.addObject("userName", getUserPseudo());
        return modelAndView;
    }

    @GetMapping(value="/info-szczegoly-zamowienia")
    public ModelAndView infoOrderDetails() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/user-order-details");
        modelAndView.addObject("userName", getUserPseudo());
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
        modelAndView.addObject("photos", photosSrc);
        modelAndView.addObject("userName", getUserPseudo());
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
        if (categories == null)
            initializeCategories();
        modelAndView.addObject("categories", categories);
        modelAndView.addObject("userName", getUserPseudo());
        return modelAndView;
    }

    private ModelAndView getProductView(int id, boolean refresh) {
        ModelAndView modelAndView = initializeModelAndViewForProductDetails(id);
        if (categories == null)
            initializeCategories();
        modelAndView.addObject("categories", categories);
        modelAndView.setViewName("user-panel/user-product-info");
        modelAndView.addObject("refreshNeeded", refresh);
        modelAndView.addObject("userName", getUserPseudo());
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

    private void editResource(String[] info) {
        int item = Integer.parseInt(info[0]);
        String name = info[1];
        ResourceType category = resourceTypeRepository.getCategoryById(Integer.parseInt(info[2])).getHigherLevelType();
        String desc = info[3];
        int points = Integer.parseInt(info[4]);
        Resource resourceToEdit = resourceRepository.getResourceById(item);
        resourceToEdit.setName(name);
        resourceToEdit.setResourceType(category);
        resourceToEdit.setDescription(desc);
        resourceToEdit.setPoints(points);
        resourceRepository.save(resourceToEdit);
    }

    private void addImagesToResource(int id, String[] images) {
        byte[] decodedByte;
        Blob blob;
        Image imgToSave;
        Resource resource = resourceRepository.getResourceById(id);
        for (String image : images) {
            if (image != null && image.length() != 0 && !image.trim().equals("")) {
                decodedByte = Base64.getDecoder().decode(image);
                try {
                    blob = new SerialBlob(decodedByte);
                    imgToSave = new Image(resource, blob);
                    imageRepository.save(imgToSave);
                }
                catch (Exception e) {e.printStackTrace();}
            }
        }
    }

    private void removeImagesFromResource(Integer[] ids) {
        List<Image> imagesToDelete = imageRepository.getImagesByIds(ids);
        imageRepository.deleteAll(imagesToDelete);
    }

    private String getUserPseudo() {
        int id = getLoggedUserId();
        return userRepository.getUserFirstName(id);
    }

    private ModelAndView getBorrowPanel() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-panel/borrow-panel");
        modelAndView.addObject("userName", getUserPseudo());
        return modelAndView;
    }

}
