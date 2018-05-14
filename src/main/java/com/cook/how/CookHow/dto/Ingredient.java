package com.cook.how.CookHow.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Ingredient{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private Boolean isEssential;
	private String name;
	private int stepNumber;

    public Ingredient(Boolean isEssential, String name, int stepNumber) {
        this.isEssential = isEssential;
        this.name = name;
        this.stepNumber = stepNumber;
    }

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Boolean getEssential() {
		return isEssential;
	}
	public void setEssential(Boolean essential) {
		isEssential = essential;
	}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStepNumber() {
        return stepNumber;
    }
    public void setStepNumber(int order) {
        this.stepNumber = order;
    }
}
