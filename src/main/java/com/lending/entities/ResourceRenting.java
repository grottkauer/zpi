package com.lending.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "resource_renting")
public class ResourceRenting extends BaseEntity {

    /*
    public enum RentingStatus {
        Utworzone(0), Zrealizowane(1), Oddane(2);

        private final int value;

        RentingStatus(int i) {
            this.value = i;
        }

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
    } */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_resource_renting")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_receiver", nullable = false)
    private User recipent;

    @Transient
    private User giver;

    @ManyToOne
    @JoinColumn(name = "id_resource", nullable = false)
    private Resource resource;

    @Column(nullable = false)
    private Date orderDate;

    @Column
    private Date borrowDate;

    @Column
    private Date giveBackDate;

    @Enumerated
    @Column(columnDefinition = "smallint", nullable = false)
    private RentingStatus status;

    public ResourceRenting() {
    }

    public ResourceRenting(int id, User giver, User recipent, Resource resource, Date addDate, Date realisationDate, Date giveBackDate, RentingStatus status) {
        super(id);
        this.giver = giver;
        this.recipent = recipent;
        this.resource = resource;
        this.orderDate = addDate;
        this.borrowDate = realisationDate;
        this.giveBackDate = giveBackDate;
        this.status = status;
    }

    public User getRecipent() {
        return recipent;
    }

    public void setRecipent(User recipent) {
        this.recipent = recipent;
    }

    public User getGiver() {
        return giver;
    }

    public void setGiver(User giver) {
        this.giver = giver;
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

    public RentingStatus getStatus() {
        return status;
    }

    public void setStatus(RentingStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResourceRenting{" +
                ", recipent=" + recipent +
                ", resource=" + resource +
                ", orderDate=" + orderDate +
                ", borrowDate=" + borrowDate +
                ", giveBackDate=" + giveBackDate +
                ", status=" + status +
                '}';
    }


}
