package com.cook.how.CookHow.controller;

import com.cook.how.CookHow.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    @Autowired
    private IngredientRepository ingredientRepository;

    @RequestMapping("/hola")
    public String prueba(){
        return "Holis";
    }

}
