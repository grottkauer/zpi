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

    @Column
    private String color;

    @Column
    private double weight;

    @ManyToOne
    @JoinColumn(name = "id_resource_type")
    private ResourceType resourceType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resource")
    private List<ResourceOwnership> resourceOwnerships = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resource")
    private List<Image> photos = new ArrayList<>();

    public Resource(){

    }

    public Resource(int points, String name, String color, double weight, ResourceType resourceType) {
        this.points = points;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.resourceType = resourceType;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setRodzajZasobuID(ResourceType resourceType) {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString(){
        return super.getId() + ", " + name + "\n";
    }
}
