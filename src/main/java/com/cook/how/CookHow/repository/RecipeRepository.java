package com.cook.how.CookHow.repository;

import com.cook.how.CookHow.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
