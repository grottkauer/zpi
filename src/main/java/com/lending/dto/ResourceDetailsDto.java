package com.lending.dto;

import com.lending.entities.RentingStatus;

public class ResourceDetailsDto {

    private int id;
    private String name;
    private int points;
    private String categoryName;
    private RentingStatus status;
    private String description;
    private int countOfRenting;

    public ResourceDetailsDto(int id, String name, int points, String categoryName,
                              RentingStatus status, String description, long countOfRenting) {
        this.id = id;
        this.name = name;
        this.points = points;
        this.categoryName = categoryName;
        this.status = status;
        this.description = description;
        this.countOfRenting = (int)countOfRenting;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public RentingStatus getStatus() {
        return status;
    }

    public void setStatus(RentingStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCountOfRenting() {
        return countOfRenting;
    }

    public void setCountOfRenting(int countOfRenting) {
        this.countOfRenting = countOfRenting;
    }
}
