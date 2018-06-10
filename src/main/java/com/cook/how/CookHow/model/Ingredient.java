package com.cook.how.CookHow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ingredient{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private Boolean isEssential;
	private Long nameId;
	private int stepNumber;

    public Ingredient(Boolean isEssential, Long nameId, int stepNumber) {
        this.isEssential = isEssential;
        this.nameId = nameId;
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
    public Long getNameId() {
        return nameId;
    }
    public void setNameId(Long nameId) {
        this.nameId = nameId;
    }
    public int getStepNumber() {
        return stepNumber;
    }
    public void setStepNumber(int order) {
        this.stepNumber = order;
    }
}
