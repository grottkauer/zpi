package com.lending.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "meeting")
public class Meeting extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "id_address")
    private Address address;

    @Column
    private String name;

    @Column
    private Date meetingDate;

    private ResourceRenting resourceRenting;

    public Meeting() {
    }

    public Meeting(Address address, String name, Date meetingDate, ResourceRenting resourceRenting) {
        this.address = address;
        this.name = name;
        this.meetingDate = meetingDate;
        this.resourceRenting = resourceRenting;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    public ResourceRenting getResourceRenting() {
        return resourceRenting;
    }

    public void setResourceRenting(ResourceRenting resourceRenting) {
        this.resourceRenting = resourceRenting;
    }
}
