package com.cook.how.CookHow.dto;

import java.io.Serializable;
import java.util.List;

import com.google.common.collect.Lists;

public class User implements Serializable{

	private static final long serialVersionUID = -8170887703924265854L;
	
	public Long id;
	public String username;
	public List<Comment> myComments;
	public List<Recipe> myRecepies;
	
	public User(Long id, String username, List<Comment> comments, List<Recipe> recepies) {
		super();
		this.id = id;
		this.username = username;
		this.myComments = comments;
		this.myRecepies = recepies;
	}
	public User() {
		super();
	}

	public void addComment(Comment comment){
		if(myComments == null){
			myComments = Lists.newArrayList();
		}
		myComments.add(comment);
	}

	public void addRecepy(Recipe recipe) {
		if (myRecepies == null) {
			myRecepies = Lists.newArrayList();
		}
		myRecepies.add(recipe);
	}
	
}
