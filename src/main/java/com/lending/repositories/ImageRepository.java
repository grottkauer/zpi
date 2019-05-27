package com.lending.repositories;

import com.lending.entities.Image;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ImageRepository extends CrudRepository<Image, Integer> {

    @Query("select i.id from Image i inner join i.resource r where r.id = :id")
    List<Integer> getPhotosIdsOfResource(@Param("id") int id);

    @Query("select i from Image i where i.id in (:ids)")
    List<Image> getImagesByIds(@Param("ids") Integer[] ids);

}
