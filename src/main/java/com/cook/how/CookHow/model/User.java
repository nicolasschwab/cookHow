package com.cook.how.CookHow.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.assertj.core.util.Lists;

public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private String username;
	private List<Comment> myComments;
	private List<Recepy> myRecepies;
	
	public User(Long id, String username, List<Comment> comments, List<Recepy> recepies) {
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
	public List<Recepy> getMyRecepies() {
		return myRecepies;
	}
	public void setMyRecepies(List<Recepy> recepies) {
		this.myRecepies = recepies;
	}
	public void addRecepy(Recepy recepy) {
		if (myRecepies == null) {
			myRecepies = Lists.newArrayList();
		}
		myRecepies.add(recepy);
	}
	
}
