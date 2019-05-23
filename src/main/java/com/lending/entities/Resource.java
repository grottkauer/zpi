package com.lending.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "resource")
public class Resource extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(nullable = false)
    private int points;

    @Column(nullable = false)
    private String name;

    @Column(length = 8192)
    private String description;

    @Column(nullable = false)
    private Date addDate;

    @Column(nullable = false)
    private boolean canBeBorrowed = false;

    @Column(nullable = false)
    private boolean isDeleted = false;

    @ManyToOne
    @JoinColumn(name = "id_resource_type")
    private ResourceType resourceType;

    @ManyToOne
    @JoinColumn(name = "id_owner")
    private Person owner;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resource")
    private List<ResourceRenting> rentings = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resource")
    private List<Image> images = new ArrayList<>();


    public Resource() {

    }

    public Resource(int points, String name, String description, ResourceType resourceType, Person owner,
                    Date addDate, boolean canBeBorrowed, boolean isDeleted) {
        this.points = points;
        this.name = name;
        this.resourceType = resourceType;
        this.owner = owner;
        this.addDate = addDate;
        this.canBeBorrowed = canBeBorrowed;
        this.isDeleted = isDeleted;
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
        return super.getId_resource() + ", " + name + "\n";
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

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public boolean isCanBeBorrowed() {
        return canBeBorrowed;
    }

    public void setCanBeBorrowed(boolean canBeBorrowed) {
        this.canBeBorrowed = canBeBorrowed;
    }

    public int getId() {
        return id;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public List<ResourceRenting> getRentings() {
        return rentings;
    }

    public void setRentings(List<ResourceRenting> rentings) {
        this.rentings = rentings;
    }
}
