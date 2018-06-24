package com.cook.how.CookHow.service;

import com.cook.how.CookHow.dto.Ingredient;
import com.cook.how.CookHow.repository.IngredientRepository;
import com.cook.how.CookHow.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private Mapper mapper;

    public List<Ingredient> getIngredientsStartingWith(String partialName){
        List<com.cook.how.CookHow.model.Ingredient> ingredients = ingredientRepository.findByNameStartingWith(partialName);
        return mapper.mapList(ingredients, Ingredient.class);
    }

    public List<Ingredient> getAll(){
        List<com.cook.how.CookHow.model.Ingredient> ingredients = ingredientRepository.findAll();
        return mapper.mapList(ingredients, Ingredient.class);
    }

}
