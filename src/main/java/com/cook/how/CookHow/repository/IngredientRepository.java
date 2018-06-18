package com.cook.how.CookHow.repository;

import com.cook.how.CookHow.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

    public List<Ingredient> findByNameStartingWith(String partialName);

}
