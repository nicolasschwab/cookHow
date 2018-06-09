package com.cook.how.CookHow.controller;

import com.cook.how.CookHow.model.IngredientName;
import com.cook.how.CookHow.repository.IngredientNameRepository;
import com.cook.how.CookHow.service.IngredientNameService;
import com.cook.how.CookHow.validator.IngredientNormalizerValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ingredientNormalizer")
public class IngredientNormalizerController{

    @Autowired
    IngredientNameService ingredientNameService;

    @GetMapping("/inferAndGet/{threeLettersIngredient}")
    public String inferAndGet(@PathVariable String threeLettersIngredient){
        IngredientNormalizerValidator.validateInferAndGet(threeLettersIngredient);
        List<IngredientName> ingredientsName = ingredientNameService.getIngredientStartingWith(threeLettersIngredient);
        return "";
    }
}
