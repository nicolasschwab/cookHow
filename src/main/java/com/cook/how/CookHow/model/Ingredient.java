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
	private String name;
	
    public Ingredient(Boolean isEssential, String name) {
		super();
		this.isEssential = isEssential;
		this.name = name;
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
	public Boolean getIsEssential() {
		return isEssential;
	}
	public void setIsEssential(Boolean isEssential) {
		this.isEssential = isEssential;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
