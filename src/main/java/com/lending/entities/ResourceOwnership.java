package com.lending.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "resources_ownership")
public class ResourceOwnership extends BaseEntity {

    @Column(nullable = false)
    private Date addDate;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_resource")
    private Resource resource;

    public ResourceOwnership() {
    }

    public ResourceOwnership(Date addDate, User user, Resource resource) {
        this.addDate = addDate;
        this.user = user;
        this.resource = resource;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
}
