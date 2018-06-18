package com.cook.how.CookHow.validator;

import com.cook.how.CookHow.dto.Ingredient;

public class IngredientNormalizerValidator extends Validator{

    private static final String INGREDIENT_NAME = "Ingredient name";
    private static final String INGREDIENT = "Ingredient";

    public static void validateInferAndGet(Ingredient ingredient){
        objetCantBeNull(ingredient, INGREDIENT);
        stringIsNotNullNorEmpty(ingredient.name, INGREDIENT_NAME);
        stringLengthIsGraterThanTwo(ingredient.name, INGREDIENT_NAME);
    }
}
