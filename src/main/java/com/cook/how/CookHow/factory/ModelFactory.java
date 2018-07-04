package com.cook.how.CookHow.factory;

import com.cook.how.CookHow.model.Ingredient;

public class ModelFactory {

    public static Ingredient createNewIngredientWithName(String name){
        return new Ingredient(Boolean.FALSE, name);
    }
}
