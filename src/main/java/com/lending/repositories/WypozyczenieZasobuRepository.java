package com.lending.repositories;

import com.lending.entities.WypozyczenieZasobu;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WypozyczenieZasobuRepository {

    <S extends WypozyczenieZasobu> S save(S entity);

    <S extends WypozyczenieZasobu> Iterable<S> saveAll(Iterable<S> entities);

    Optional<WypozyczenieZasobu> findById(Integer id);

    boolean existsById(Integer integer);

    Iterable<WypozyczenieZasobu> findAll();

    Iterable<WypozyczenieZasobu> findAllById(Iterable<Integer> ids);

    long count();

    void deleteById(Integer integer);

    void delete(WypozyczenieZasobu entity);

    void deleteAll(Iterable<? extends WypozyczenieZasobu> entities);

    void deleteAll();
}
