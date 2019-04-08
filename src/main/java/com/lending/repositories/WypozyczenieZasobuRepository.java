package com.lending.repositories;

import com.lending.entities.ResourceRenting;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WypozyczenieZasobuRepository {

    <S extends ResourceRenting> S save(S entity);

    <S extends ResourceRenting> Iterable<S> saveAll(Iterable<S> entities);

    Optional<ResourceRenting> findById(Integer id);

    boolean existsById(Integer integer);

    Iterable<ResourceRenting> findAll();

    Iterable<ResourceRenting> findAllById(Iterable<Integer> ids);

    long count();

    void deleteById(Integer integer);

    void delete(ResourceRenting entity);

    void deleteAll(Iterable<? extends ResourceRenting> entities);

    void deleteAll();
}
