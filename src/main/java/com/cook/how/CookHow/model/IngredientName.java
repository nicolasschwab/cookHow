package com.cook.how.CookHow.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class IngredientName {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String name;
    @OneToMany(targetEntity=IngredientName.class, fetch=FetchType.EAGER)
    private List<IngredientName> subIngredient;

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
    public List<IngredientName> getSubIngredient() {
        return subIngredient;
    }
    public void setSubIngredient(List<IngredientName> subIngredient) {
        this.subIngredient = subIngredient;
    }
}
