package com.cook.how.CookHow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cook.how.CookHow.dto.Recipe;
import com.cook.how.CookHow.service.RecipeService;

@Controller
@RequestMapping("/recipe")
public class RecipeController {
	
	private RecipeService recipeService;
	
	@PostMapping("/add")
	public String addRecipe(Recipe recipe){
		return "";
	}

}
