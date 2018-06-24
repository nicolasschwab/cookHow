package com.cook.how.CookHow.dto;

import java.io.Serializable;

public class Ingredient implements Serializable{
	
	private static final long serialVersionUID = 3988019428662268447L;
	
	public Long id;
	public Boolean isEssential;
	public String name;

	public Ingredient(Long id, Boolean isEssential, String name) {
		super();
		this.id = id;
		this.isEssential = isEssential;
		this.name = name;
	}

	public Ingredient() {
	}

    public void setId(Long id) {
        this.id = id;
    }

    public void setEssential(Boolean essential) {
        isEssential = essential;
    }

    public void setName(String name) {
        this.name = name;
    }
}
