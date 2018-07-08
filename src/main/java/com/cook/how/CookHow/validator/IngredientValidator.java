package com.cook.how.CookHow.validator;

import com.cook.how.CookHow.dto.Ingredient;

import static com.cook.how.CookHow.util.PropertyName.*;

public class IngredientValidator extends Validator{

    public static void validateInferAndGet(String ingredientName){
        stringIsNotNullNorEmpty(ingredientName, INGREDIENT_NAME);
        stringLengthIsGraterThanTwo(ingredientName, INGREDIENT_NAME);
    }

    public static void validateAdd(String ingredientName) {
        stringIsNotNullNorEmpty(ingredientName, INGREDIENT_NAME);
    }

    public static void validateEdit(Ingredient ingredient) {
        objetCantBeNull(ingredient, INGREDIENT);
        stringIsNotNullNorEmpty(ingredient.name, INGREDIENT_NAME);
        objetCantBeNull(ingredient.isEssential, INGREDIENT_IS_ESSENTIAL);
        objetCantBeNull(ingredient.id, INGREDIENT_ID);
    }

}
