package com.cook.how.CookHow.model;

import com.google.common.collect.Lists;

import java.util.List;

import javax.persistence.*;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private String username;
    @OneToMany(targetEntity=Comment.class)
	private List<Comment> myComments;
    @OneToMany(targetEntity=Recipe.class, mappedBy="owner")
	private List<Recipe> myRecepies;
	
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<Comment> getMyComments() {
		return myComments;
	}
	public void setMyComments(List<Comment> comments) {
		this.myComments = comments;
	}
	public void addComment(Comment comment){
		if(myComments == null){
			myComments = Lists.newArrayList();
		}
		myComments.add(comment);
	}
	public List<Recipe> getMyRecepies() {
		return myRecepies;
	}
	public void setMyRecepies(List<Recipe> recepies) {
		this.myRecepies = recepies;
	}
	public void addRecepy(Recipe recipe) {
		if (myRecepies == null) {
			myRecepies = Lists.newArrayList();
		}
		myRecepies.add(recipe);
	}
	
}
