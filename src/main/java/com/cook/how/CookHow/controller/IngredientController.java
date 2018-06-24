package com.cook.how.CookHow.controller;

import com.cook.how.CookHow.dto.Ingredient;
import com.cook.how.CookHow.service.IngredientService;
import com.cook.how.CookHow.validator.IngredientNormalizerValidator;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    private IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/inferAndGet")
    public @ResponseBody
    List<Ingredient> inferAndGet(@RequestParam String ingredientName){
        //IngredientNormalizerValidator.validateInferAndGet(ingredient);
        return ingredientService.getIngredientsStartingWith(ingredientName);
    }

    @GetMapping("/getAll")
    public @ResponseBody List<Ingredient> getAll(){
        List<Ingredient> p = ingredientService.getAll();
        return p;
    }

}
