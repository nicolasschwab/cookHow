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

import java.util.Optional;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private Mapper mapper;

    @Autowired
    private MessageFactory ingredientMessageFactory;

    public Response getIngredientsStartingWith(String partialName){
        return ResponseFactory.createResponseWithPayload(mapper.mapList(ingredientRepository.findByNameStartingWith(partialName), Ingredient.class));
    }

    public Response getAll(){
        return ResponseFactory.createResponseWithPayload(mapper.mapList(ingredientRepository.findAll(), Ingredient.class));
    }

    public Response get(Long id){
        return ResponseFactory.createResponseWithPayload(mapper.map(ingredientRepository.findById(id), Ingredient.class));
    }

    public synchronized Response addIngredient(String ingredientName) {
        return ingredientNameAlreadyExist(ingredientName) ?
            ResponseFactory.createBadRequestResponse(ingredientMessageFactory.createElementAlreadyExist(ingredientName))
            :
            mapIngredientAndCreateResponse(ingredientRepository.save(ModelFactory.createNewIngredientWithName(ingredientName)));
    }

    private Boolean ingredientNameAlreadyExist(String ingredientName){
        return ingredientRepository.findByName(ingredientName).isPresent();
    }

    public Response editIngredient(Ingredient ingredient) {
        Optional<com.cook.how.CookHow.model.Ingredient> optionalModifiedIngredient = copy(ingredientRepository.findById(ingredient.id), ingredient);
        if( optionalModifiedIngredient.isPresent() ){
            return mapIngredientAndCreateResponse(ingredientRepository.save(optionalModifiedIngredient.get()));
        }
        return ResponseFactory.createNotFoundResponse();
    }

    private Response mapIngredientAndCreateResponse(com.cook.how.CookHow.model.Ingredient ingredient){
        return ResponseFactory.createResponseWithPayload(
                mapper.map(
                        ingredient,
                        Ingredient.class
                )
        );
    }

    private Optional<com.cook.how.CookHow.model.Ingredient> copy(Optional<com.cook.how.CookHow.model.Ingredient> modelIngredient, Ingredient newIngredient){
        return modelIngredient.map( ingredient -> ingredient.copy(newIngredient.isEssential, newIngredient.name));
    }

}
