package com.lending.dto;

import com.lending.entities.ResourceType;

import java.util.ArrayList;
import java.util.List;

public class CategoriesDto {

    private ResourceType higherLevelType;
    private List<CategoriesDto> subcategories;

    public CategoriesDto(ResourceType higherLevelType, List<CategoriesDto> subcategories) {
        this.higherLevelType = higherLevelType;
        this.subcategories = subcategories;
    }

    public CategoriesDto(ResourceType higherLevelType) {
        this.higherLevelType = higherLevelType;
        this.subcategories = new ArrayList<>();
    }

    public ResourceType getHigherLevelType() {
        return higherLevelType;
    }

    public void setHigherLevelType(ResourceType higherLevelType) {
        this.higherLevelType = higherLevelType;
    }

    public List<CategoriesDto> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<CategoriesDto> subcategories) {
        this.subcategories = subcategories;
    }
}
