package com.lending.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "meeting")
public class Meeting extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "id_address", nullable = false)
    private Address address;

    @ManyToOne
    @JoinColumn(name = "id_resource_renting", nullable = false)
    private ResourceRenting resourceRenting;

    @Column(nullable = false)
    private Date meetingDate;

    public Meeting() {

    }

    public Meeting(Address address, Date meetingDate, ResourceRenting resourceRenting) {
        this.address = address;
        this.meetingDate = meetingDate;
        this.resourceRenting = resourceRenting;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
