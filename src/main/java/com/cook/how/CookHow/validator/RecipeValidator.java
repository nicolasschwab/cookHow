package com.cook.how.CookHow.validator;

import com.cook.how.CookHow.dto.Recipe;

import static com.cook.how.CookHow.util.PropertyName.INGREDIENTS;
import static com.cook.how.CookHow.util.PropertyName.INSTRUCTIONS;
import static com.cook.how.CookHow.util.PropertyName.OWNER_ID;

public class RecipeValidator extends Validator{
	
	public static void validateAdd(Recipe recipe){
		hasAtLeastOneElement(recipe.ingredients, INGREDIENTS);
		hasAtLeastOneElement(recipe.instructions, INSTRUCTIONS);
		stringIsNotNullNorEmpty(recipe.owner.id.toString(), OWNER_ID);
	}
	
}
