package com.cook.how.CookHow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instruction{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private String description;
	private int stepNumber;

	public Instruction(String description, int stepNumber) {
		this.description = description;
		this.stepNumber = stepNumber;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getStepNumber() {
		return stepNumber;
	}
	public void setStepNumber(int order) {
		this.stepNumber = order;
	}

}
