package com.lending.services;

import com.lending.entities.User;
import com.lending.entities.ResourceRenting;
import com.lending.entities.Resource;
import com.lending.repositories.WypozyczenieZasobuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WypozyczenieZasobuService {

    private WypozyczenieZasobuRepository wypozyczenieZasobuRepository;

    @Autowired
    public WypozyczenieZasobuService(WypozyczenieZasobuRepository wypozyczenieZasobuRepository) {
        this.wypozyczenieZasobuRepository = wypozyczenieZasobuRepository;
    }

    public ResourceRenting getWypozyczenie(int id){
        return wypozyczenieZasobuRepository.findById(id).get();
    }

    public ResourceRenting createWypozyczenie(User dawca, User biorca, Resource resource){
        ResourceRenting resourceRenting = new ResourceRenting();
        resourceRenting.setGiver(dawca);
        resourceRenting.setGetter(biorca);
        resourceRenting.setResource(resource);
        return wypozyczenieZasobuRepository.save(resourceRenting);
    }
}
