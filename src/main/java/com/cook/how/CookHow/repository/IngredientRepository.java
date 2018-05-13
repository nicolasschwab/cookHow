package com.cook.how.CookHow.repository;

import com.cook.how.CookHow.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

}
