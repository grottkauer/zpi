package com.lending.entities;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name="image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne
    @JoinColumn(name="id_resource")
    private Resource resource;

    @Column(nullable = false)
    private Blob content;

    public Image() {

    }

    public Image(int id, Resource resource, Blob content) {
        this.id = id;
        this.resource = resource;
        this.content = content;
    }

    public Image(Resource resource, Blob content) {
        this.resource = resource;
        this.content = content;
    }

    public int getId() {
        return id;
    }


    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public Blob getContent() {
        return content;
    }

    public void setContent(Blob content) {
        this.content = content;
    }
}
