package com.lending.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "resource")
public class Resource extends BaseEntity {

    @Column
    private int points;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_resource_type")
    private ResourceType resourceType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resource")
    private List<ResourceOwnership> resourceOwnerships = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resource")
    private List<Image> photos = new ArrayList<>();

    public Resource(){

    }

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
