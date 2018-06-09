package com.cook.how.CookHow.service;

import com.cook.how.CookHow.model.IngredientName;
import com.cook.how.CookHow.repository.IngredientNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientNameService {


    @Autowired
    private IngredientNameRepository ingredientNameRepository;

    public List<IngredientName> getIngredientStartingWith(String threeLetters){
        return ingredientNameRepository.findByNameStartsWith(threeLetters);
    }

}
