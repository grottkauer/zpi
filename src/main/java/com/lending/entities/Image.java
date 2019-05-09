package com.lending.entities;

import javax.persistence.*;

@Entity
@Table(name = "image")
public class Image extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "id_resource")
    private Resource resource;

    @Column(nullable = false)
    private String imageName;

    @Column(nullable = false)
    private String imagePath;

    public Image() {
    }

    public Image(Resource resource, String imageName, String imagePath) {
        this.resource = resource;
        this.imageName = imageName;
        this.imagePath = imagePath;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
