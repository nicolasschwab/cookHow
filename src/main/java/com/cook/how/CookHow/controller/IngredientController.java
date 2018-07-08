package com.cook.how.CookHow.controller;

import com.cook.how.CookHow.dto.Ingredient;
import com.cook.how.CookHow.factory.ResponseFactory;
import com.cook.how.CookHow.service.IngredientService;
import com.cook.how.CookHow.util.Response;
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
    public @ResponseBody List<Ingredient> inferAndGet(@RequestParam String ingredientName){
        IngredientValidator.validateInferAndGet(ingredientName);
        return ingredientService.getIngredientsStartingWith(ingredientName);
    }

    @GetMapping("/getAll")
    public @ResponseBody List<Ingredient> getAll(){
        return ingredientService.getAll();
    }

    @GetMapping("/get/{id}")
    public @ResponseBody Response get(@PathVariable Long id){
        return ResponseFactory.createOkResponseWithPayload(ingredientService.get(id));
    }

    @PostMapping("/add")
    public @ResponseBody Response add(@RequestBody Ingredient ingredient){
        IngredientValidator.validateAdd(ingredient.name);
        return ingredientService.addIngredient(ingredient.name);
    }

    @PutMapping("/edit")
    public void edit(Ingredient ingredient){
        IngredientValidator.validateEdit(ingredient);
        ingredientService.editIngredient(ingredient);
    }

}
