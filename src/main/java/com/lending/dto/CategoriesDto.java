package com.lending.dto;

import com.lending.entities.ResourceType;

import java.util.List;

public class CategoriesDto {

    private ResourceType higherLevelType;
    private List<ResourceType> subcategories;

    public CategoriesDto(ResourceType higherLevelType, List<ResourceType> subcategories) {
        this.higherLevelType = higherLevelType;
        this.subcategories = subcategories;
    }

    public ResourceType getHigherLevelType() {
        return higherLevelType;
    }

    public void setHigherLevelType(ResourceType higherLevelType) {
        this.higherLevelType = higherLevelType;
    }

    public List<ResourceType> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<ResourceType> subcategories) {
        this.subcategories = subcategories;
    }
}
