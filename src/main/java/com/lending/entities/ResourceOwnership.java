package com.lending.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "resourcesOwnerships")
public class ResourceOwnership extends EncjaBazowa{

    @Column(nullable = false)
    private Date addDate;

    @ManyToOne
    @JoinColumn(name = "uzytkownik_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "zasob_id")
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
