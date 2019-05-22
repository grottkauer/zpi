package com.lending.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "notification")
public class Notification extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_notification")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_sender")
    private Person sender;

    @ManyToOne
    @JoinColumn(name = "id_receiver")
    private Person receiver;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Date sendingDate;


    @Column
    private Date openDate;

    public Notification() {
    }

    public Notification(Person sender, Person receiver, String title, String description, Date sendingDate, Date openDate) {
        this.sender = sender;
        this.receiver = receiver;
        this.title = title;
        this.description = description;
        this.sendingDate = sendingDate;
        this.openDate = openDate;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getReceiver() {
        return receiver;
    }

    public void setReceiver(Person receiver) {
        this.receiver = receiver;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getSendingDate() {
        return sendingDate;
    }

    public void setSendingDate(Date sendingDate) {
        this.sendingDate = sendingDate;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }
}
