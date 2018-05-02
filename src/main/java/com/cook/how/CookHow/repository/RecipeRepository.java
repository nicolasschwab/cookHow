package com.cook.how.CookHow.repository;

import com.cook.how.CookHow.model.Recepy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recepy, Long> {
}
