package com.lending;

import com.lending.entities.RodzajZasobu;
import com.lending.entities.Zasob;
import com.lending.repositories.RodzajZasobuRepository;
import com.lending.repositories.ZasobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ZasobService {
    private final ZasobRepository zasobRepository;

    @Autowired
    public RodzajZasobuRepository rodzajZasobuRepository;

    public ZasobService(ZasobRepository zasobRepository){
        this.zasobRepository = zasobRepository;
    }

    public List<Zasob> findAll(){
        List<Zasob> zasoby = new ArrayList<>();
        for (Zasob zasob: zasobRepository.findAll()){
            zasoby.add(zasob);
        }
        return zasoby;
    }

//    public Zasob getZasob(int id){
//        return zasobRepository.findOne(id);
//    }

    public void addZasob(Zasob zasob){

        zasobRepository.save(zasob);
    }

    public void updateZasob(Zasob zasob){
        zasobRepository.save(zasob);
    }

    public void deleteZasob(int id){
        zasobRepository.deleteById(id);
    }
}
