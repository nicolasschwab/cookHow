package com.cook.how.CookHow.service;

import com.cook.how.CookHow.dto.Ingredient;
import com.cook.how.CookHow.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;

    public List<Ingredient> getIngredientsStartingWith(String partialName){
        List<com.cook.how.CookHow.model.Ingredient> ingredients = ingredientRepository.findByNameStartingWith(partialName);

    }

}
