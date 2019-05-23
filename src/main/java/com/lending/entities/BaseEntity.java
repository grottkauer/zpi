package com.lending.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public BaseEntity() {

    }

    public BaseEntity(int id){
        this.id = id;
    }

    public int getId_resource() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
