package com.cook.how.CookHow.repository;

import com.junicab.cookhow.model.Instruction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructionRepository extends JpaRepository<Instruction, Long> {
}
