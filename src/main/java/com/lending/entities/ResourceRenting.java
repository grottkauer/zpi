package com.lending.entities;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ResourceRenting extends BaseEntity {

    public enum RentingStatus {
        Utworzone, Zrealizowane, Oddane;

        public static RentingStatus fromInteger(int integer){
            switch (integer){
                case 0:
                    return Utworzone;
                case 1:
                    return Zrealizowane;
                case 2:
                    return Oddane;
            }
            return null;
        }
    }

    private User giver;

    private User getter;

    private Resource resource;

    private Date addDate;

    private Date realisationDate;

    private Date giveBackDate;

    private RentingStatus rentingStatus;

    public ResourceRenting() {
    }

    public ResourceRenting(int id, User giver, User getter, Resource resource, Date addDate, Date realisationDate, Date giveBackDate, RentingStatus rentingStatus) {
        super(id);
        this.giver = giver;
        this.getter = getter;
        this.resource = resource;
        this.addDate = addDate;
        this.realisationDate = realisationDate;
        this.giveBackDate = giveBackDate;
        this.rentingStatus = rentingStatus;
    }

    public User getGiver() {
        return giver;
    }

    public void setGiver(User giver) {
        this.giver = giver;
    }

    public User getGetter() {
        return getter;
    }

    public void setGetter(User getter) {
        this.getter = getter;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Date getRealisationDate() {
        return realisationDate;
    }

    public void setRealisationDate(Date realisationDate) {
        this.realisationDate = realisationDate;
    }

    public Date getGiveBackDate() {
        return giveBackDate;
    }

    public void setGiveBackDate(Date giveBackDate) {
        this.giveBackDate = giveBackDate;
    }

    public RentingStatus getRentingStatus() {
        return rentingStatus;
    }

    public void setRentingStatus(RentingStatus rentingStatus) {
        this.rentingStatus = rentingStatus;
    }
}
