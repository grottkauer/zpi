package com.lending.entities;

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

    @Column
    private String addDate;

    @OneToMany(mappedBy = "resourceType", cascade = CascadeType.ALL)
    private List<Resource> resources;

    @OneToMany(mappedBy = "higherLevel", cascade = CascadeType.ALL)
    private List<ResourceType> higherLevels;

    @ManyToOne
    @JoinColumn(name = "id_resource_type_higher_level")
    private ResourceType higherLevel;

    public ResourceType(){

    }

    public ResourceType(int resourceTypeID, String name, String addDate) {
        this.resourceTypeID = resourceTypeID;
        this.name = name;
        this.addDate = addDate;
    }

    public ResourceType(int resourceTypeID, String name, String addDate, ResourceType higherLevel) {
        this.resourceTypeID = resourceTypeID;
        this.name = name;
        this.addDate = addDate;
        this.higherLevel = higherLevel;
    }

    public ResourceType getHigherLevel() {
        return higherLevel;
    }

    public void setHigherLevel(ResourceType higherLevel) {
        this.higherLevel = higherLevel;
    }

    public List<ResourceType> getHigherLevels() {
        return higherLevels;
    }

    public void setHigherLevels(List<ResourceType> higherLevels) {
        this.higherLevels = higherLevels;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public int getResourceTypeID() {
        return resourceTypeID;
    }

    public void setResourceTypeID(int resourceTypeID) {
        this.resourceTypeID = resourceTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    @Override
    public String toString() {
        return "Rodzaj zasobu [id = " + resourceTypeID + ", name = " + name + ", data dodania = " + addDate + "]\n";
    }
}
