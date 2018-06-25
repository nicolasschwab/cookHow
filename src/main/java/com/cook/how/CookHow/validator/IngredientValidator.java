package com.cook.how.CookHow.validator;

import com.cook.how.CookHow.dto.Ingredient;

public class IngredientValidator extends Validator{

    private static final String INGREDIENT_NAME = "Ingredient name";
    private static final String INGREDIENT = "Ingredient";

    public static void validateInferAndGet(String ingredientName){
        stringIsNotNullNorEmpty(ingredientName, INGREDIENT_NAME);
        stringLengthIsGraterThanTwo(ingredientName, INGREDIENT_NAME);
    }

    public static void validateAdd(Ingredient ingredient) {
        stringIsNotNullNorEmpty(ingredient.name, INGREDIENT_NAME);
    }
}
