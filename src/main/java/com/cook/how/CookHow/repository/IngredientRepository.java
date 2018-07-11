package com.cook.how.CookHow.repository;

import com.cook.how.CookHow.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

    public List<Ingredient> findByNameStartingWith(String partialName);

    public Optional<Ingredient> findByName(String name);

}
