package com.lending.entities;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "resource_type")
public class ResourceType {

    @Id
    @Column(name = "id_resource_type")
    private int resourceTypeID;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_resource_type_higher_level")
    private ResourceType higherLevel;

    public ResourceType() {

    }

    public ResourceType(int id, String name, ResourceType higherLevel) {
        this.resourceTypeID = id;
        this.name = name;
        this.higherLevel = higherLevel;
    }

    public ResourceType getHigherLevel() {
        return higherLevel;
    }

    public void setHigherLevel(ResourceType higherLevel) {
        this.higherLevel = higherLevel;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
