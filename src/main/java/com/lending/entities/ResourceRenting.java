package com.lending.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "resource_renting")
public class ResourceRenting extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_receiver", nullable = false)
    private Person recipent;

    @Transient
    private Person giver;

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

    public ResourceRenting(int id, Person giver, Person recipent, Resource resource, Date addDate, Date realisationDate, Date giveBackDate, RentingStatus status) {
        super(id);
        this.giver = giver;
        this.recipent = recipent;
        this.resource = resource;
        this.orderDate = addDate;
        this.borrowDate = realisationDate;
        this.giveBackDate = giveBackDate;
        this.status = status;
    }

    public Person getRecipent() {
        return recipent;
    }

    public void setRecipent(Person recipent) {
        this.recipent = recipent;
    }

    public Person getGiver() {
        return giver;
    }

    public void setGiver(Person giver) {
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
