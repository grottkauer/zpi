package com.lending.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "resource_renting")
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

    @Column(nullable = false)
    private User giver;

    @Column(nullable = false)
    private User getter;

    @Column(nullable = false)
    private Resource resource;

    @Column(nullable = false)
    private Date orderDate;

    @Column
    private Date borrowDate;

    @Column
    private Date giveBackDate;

    @Enumerated
    @Column(columnDefinition = "smallint", nullable = false)
    private RentingStatus rentingStatus;

    public ResourceRenting() {
    }

    public ResourceRenting(int id, User giver, User getter, Resource resource, Date addDate, Date realisationDate, Date giveBackDate, RentingStatus rentingStatus) {
        super(id);
        this.giver = giver;
        this.getter = getter;
        this.resource = resource;
        this.orderDate = addDate;
        this.borrowDate = realisationDate;
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
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

    @Override
    public String toString() {
        return "ResourceRenting{" +
                "giver=" + giver +
                ", getter=" + getter +
                ", resource=" + resource +
                ", orderDate=" + orderDate +
                ", borrowDate=" + borrowDate +
                ", giveBackDate=" + giveBackDate +
                ", rentingStatus=" + rentingStatus +
                '}';
    }
}
