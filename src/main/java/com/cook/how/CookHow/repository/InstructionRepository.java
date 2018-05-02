package com.cook.how.CookHow.repository;

import com.cook.how.CookHow.model.Instruction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructionRepository extends JpaRepository<Instruction, Long> {
}
