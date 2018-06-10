package com.cook.how.CookHow.validator;

import com.cook.how.CookHow.dto.Recipe;

public class RecipeValidator extends Validator{

	private static final String INGREDIENTS = "The list of ingredients";
	private static final String INSTRUCTIONS = "The list of instructions";
	private static final String OWNER_ID = "The owner";
	
	public static void validateAdd(Recipe recipe){
		hasAtLeastOneElement(recipe.ingredients, INGREDIENTS);
		hasAtLeastOneElement(recipe.instructions, INSTRUCTIONS);
		stringIsNotNullNorEmpty(recipe.owner.id.toString(), OWNER_ID);
	}
	
}
