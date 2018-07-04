package com.cook.how.CookHow.service;

import com.cook.how.CookHow.dto.Ingredient;
import com.cook.how.CookHow.factory.message.MessageFactory;
import com.cook.how.CookHow.factory.ModelFactory;
import com.cook.how.CookHow.factory.ResponseFactory;
import com.cook.how.CookHow.repository.IngredientRepository;
import com.cook.how.CookHow.util.Mapper;
import com.cook.how.CookHow.util.Response;
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
        return mapper.mapList(ingredientRepository.findByNameStartingWith(partialName), Ingredient.class);
    }

    public List<Ingredient> getAll(){
        return mapper.mapList(ingredientRepository.findAll(), Ingredient.class);
    }

    public Ingredient get(Long id){
        return mapper.map(ingredientRepository.findById(id), Ingredient.class);
    }

    public synchronized Response addIngredient(String ingredientName) {
        if (ingredientNameAlreadyExist(ingredientName)){
            return ResponseFactory.createBadRequestResponse(MessageFactory.createElementAlreadyExist(ingredientName));
        }
        return ResponseFactory.createOkResponseWithPayload(
                mapper.map(
                        ingredientRepository.save(ModelFactory.createNewIngredientWithName(ingredientName)),
                        Ingredient.class
                )
            );
    }

    private Boolean ingredientNameAlreadyExist(String ingredientName){
        return ingredientRepository.findByName(ingredientName).isPresent();
    }

    public Ingredient editIngredient(Ingredient ingredient) {
        return ingredientRepository.findById(ingredient.id);
    }

}
