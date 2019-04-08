package com.lending;

import com.lending.entities.Resource;
import com.lending.repositories.RodzajZasobuRepository;
import com.lending.repositories.ZasobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ZasobService{
    private final ZasobRepository zasobRepository;

    @Autowired
    public RodzajZasobuRepository rodzajZasobuRepository;

    public ZasobService(ZasobRepository zasobRepository){
        this.zasobRepository = zasobRepository;
    }

    public List<Resource> findAll(){
        List<Resource> zasoby = new ArrayList<>();
        for (Resource resource : zasobRepository.findAll()){
            zasoby.add(resource);
        }
        return zasoby;
    }

    public Resource getZasob(int id){
        return zasobRepository.findById(id).get();
    }

    public void addZasob(Resource resource){

        zasobRepository.save(resource);
    }

    public void updateZasob(Resource resource){
        zasobRepository.save(resource);
    }

    public void deleteZasob(int id){
        zasobRepository.deleteById(id);
    }
}
