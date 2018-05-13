package com.cook.how.CookHow.repository;

import com.cook.how.CookHow.model.IngredientName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IngredientNameRepository extends JpaRepository<IngredientName, Long> {

    @Query("select i from IngredientName i where i.name like '?1%' or i.name like ' ?1%'")
    List<IngredientName> findByNameContaining(String threLetters);
}
