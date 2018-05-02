package com.cook.how.CookHow.repository;

import com.junicab.cookhow.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
