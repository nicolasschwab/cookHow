package com.cook.how.CookHow.validator;

public class IngredientNormalizerValidator extends Validator{

    private static final String INGREDIENT_NAME = "Ingredient name";
    private static final String INGREDIENT = "Ingredient";

    public static void validateInferAndGet(String ingredientName){
        stringIsNotNullNorEmpty(ingredientName, INGREDIENT_NAME);
        stringLengthIsGraterThanTwo(ingredientName, INGREDIENT_NAME);
    }
}
