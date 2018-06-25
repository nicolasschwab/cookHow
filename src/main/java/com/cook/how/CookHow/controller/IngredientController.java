package com.cook.how.CookHow.controller;

import com.cook.how.CookHow.dto.Ingredient;
import com.cook.how.CookHow.service.IngredientService;
import com.cook.how.CookHow.validator.IngredientValidator;
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
        IngredientValidator.validateInferAndGet(ingredientName);
        return ingredientService.getIngredientsStartingWith(ingredientName);
    }

    @GetMapping("/getAll")
    public @ResponseBody List<Ingredient> getAll(){
        return ingredientService.getAll();
    }

    @PostMapping("/add")
    public @ResponseBody List<Ingredient> add(Ingredient ingredient){
        IngredientValidator.validateAdd(ingredient);
    }

}
