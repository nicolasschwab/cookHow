package com.cook.how.CookHow.validator;

public class IngredientNormalizerValidator extends Validator{

    private static final String INGREDIENT_NAME = "Ingredient name";

    public static void validateInferAndGet(String ingredientName){
        stringIsNotNullNorEmpty(ingredientName, INGREDIENT_NAME);
        stringLengthIsThree(ingredientName, INGREDIENT_NAME);
    }
}
