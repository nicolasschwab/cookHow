package com.cook.how.CookHow.repository;

import com.cook.how.CookHow.model.Ingridient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngridientRepository extends JpaRepository<Ingridient, Long> {
}
