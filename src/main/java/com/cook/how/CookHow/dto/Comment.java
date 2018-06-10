package com.cook.how.CookHow.dto;

import java.io.Serializable;

public class Comment implements Serializable{
	
	private static final long serialVersionUID = -6891665850532188594L;
	
	public Long id;
	public String description;
	
	public Comment(Long id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
}
