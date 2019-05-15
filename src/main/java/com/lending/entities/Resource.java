package com.lending.entities;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name = "resource")
public class Resource extends BaseEntity {

    @Column(nullable = false)
    private int points;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Lob
    private Blob image;

    @ManyToOne
    @JoinColumn(name = "id_resource_type")
    private ResourceType resourceType;

    @ManyToOne
    @JoinColumn(name = "id_owner")
    private User owner;


    public Resource(int points, String name, ResourceType resourceType) {
        this.points = points;
        this.name = name;
        this.resourceType = resourceType;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return super.getId() + ", " + name + "\n";
    }
}
