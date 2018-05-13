package com.cook.how.CookHow.validator;

import com.cook.how.CookHow.exception.ValueHasBadFormat;

public class IngredientNormalizerValidator extends Validator{

    private static final String INGREDIENT_NAME = "Ingredient name";

    public static void validateInferAndGet(String ingredientName){
        if(IngredientNormalizerValidator.stringIsNotNullNorEmpty(ingredientName)
           && IngredientNormalizerValidator.stringLengthIs3(ingredientName))
        {
            throw new ValueHasBadFormat(INGREDIENT_NAME);
        }
    }
}
