package com.lending.services;

import com.lending.entities.Resource;
import com.lending.entities.ResourceRenting;
import com.lending.entities.User;
import com.lending.repositories.ResourceRentingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceRentingService {

    private ResourceRentingRepository resourceRentingRepository;

    @Autowired
    public ResourceRentingService(ResourceRentingRepository resourceRentingRepository) {
        this.resourceRentingRepository = resourceRentingRepository;
    }

    public ResourceRenting getWypozyczenie(int id){
        return resourceRentingRepository.findById(id).get();
    }

    public ResourceRenting createWypozyczenie(User giver, User getter, Resource resource){
        ResourceRenting resourceRenting = new ResourceRenting();
        resourceRenting.setGiver(giver);
        resourceRenting.setRecipent(getter);
        resourceRenting.setResource(resource);
        return resourceRentingRepository.save(resourceRenting);
    }
}
