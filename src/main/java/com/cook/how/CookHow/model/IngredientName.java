package com.cook.how.CookHow.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class IngredientName {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private List<IngredientName> subIngredientId;

    public IngredientName(String name) {
        this.name = name;
    }

    public Boolean isSubIngredient(String otherName){
        return true;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
