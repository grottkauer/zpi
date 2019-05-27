package com.lending.dto;

import java.util.ArrayList;
import java.util.List;

public class ResourceToEditDto {

    private int id;
    private String name;
    private String category;
    private String description;
    private int coins;
    private List<String> images;

    public ResourceToEditDto(int id, String name, String category, String description, int coins, List<String> images) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.coins = coins;
        this.images = images;
    }

    public ResourceToEditDto(int id, String name, String category, String description, int coins) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.coins = coins;
        this.images = new ArrayList<>(3);
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public void addImage(String image) {
        this.images.add(image);
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
