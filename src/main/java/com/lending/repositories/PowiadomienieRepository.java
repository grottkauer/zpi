package com.lending.repositories;

import com.lending.entities.Notification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowiadomienieRepository extends CrudRepository<Notification, Integer> {
}
