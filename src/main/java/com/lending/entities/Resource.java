package com.lending.entities;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name = "resource")
public class Resource extends BaseEntity {

    @Column(nullable = false)
    private int points;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column(nullable = false)
    private Date addDate;

    @Lob
    private Blob image;

    @ManyToOne
    @JoinColumn(name = "id_resource_type")
    private ResourceType resourceType;

    @ManyToOne
    @JoinColumn(name = "id_owner")
    private User owner;


    public Resource(int points, String name, String description, ResourceType resourceType, User owner,
                    Date addDate, Blob image) {
        this.points = points;
        this.name = name;
        this.resourceType = resourceType;
        this.owner = owner;
        this.addDate = addDate;
        this.image = image;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
