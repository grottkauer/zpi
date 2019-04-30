package com.lending.services;

import com.lending.entities.Resource;
import com.lending.repositories.ResourceTypeRepository;
import com.lending.repositories.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ResourceService {
    private final ResourceRepository resourceRepository;

    @Autowired
    public ResourceTypeRepository resourceTypeRepository;

    public ResourceService(ResourceRepository resourceRepository){
        this.resourceRepository = resourceRepository;
    }

    public List<Resource> findAll(){
        List<Resource> zasoby = new ArrayList<>();
        for (Resource resource : resourceRepository.findAll()){
            zasoby.add(resource);
        }
        return zasoby;
    }

    public Resource getResource(int id){
        return resourceRepository.findById(id).get();
    }

    public void addResource(Resource resource){

        resourceRepository.save(resource);
    }

    public void updateResource(Resource resource){
        resourceRepository.save(resource);
    }

    public void deleteResource(int id){
        resourceRepository.deleteById(id);
    }
}
