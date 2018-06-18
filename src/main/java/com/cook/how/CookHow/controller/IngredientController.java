package com.cook.how.CookHow.controller;

import com.cook.how.CookHow.dto.Ingredient;
import com.cook.how.CookHow.repository.IngredientRepository;
import com.cook.how.CookHow.service.IngredientService;
import com.cook.how.CookHow.validator.IngredientNormalizerValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @GetMapping("/inferAndGet")
    public String inferAndGet(Ingredient ingredient){
        IngredientNormalizerValidator.validateInferAndGet(ingredient);
        ingredientService.getIngredientsStartingWith(ingredient.name);
        return "";
    }

}
