package com.cook.how.CookHow.dto;

import java.io.Serializable;

public class Instruction implements Serializable{

	private static final long serialVersionUID = 8785903520960741395L;
	
	public Long id;
	public String description;
	public int stepNumber;

	public Instruction(Long id, String description, int stepNumber) {
		this.id = id;
		this.description = description;
		this.stepNumber = stepNumber;
	}

}
