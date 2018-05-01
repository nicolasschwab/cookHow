package com.cook.how.CookHow.model;

public class ListElement {

	private String description;
	private int stepNumber;
	
	public ListElement(String description, int order) {
		super();
		this.description = description;
		this.stepNumber = order;
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
