package com.cook.how.CookHow.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.google.common.collect.Lists;


public class Recipe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private List<Ingredient> ingredients;
	private List<Instruction> instructions;
	private List<Comment> comments;
	private Double rate;
	private User owner;

	public Recipe(Long id, List<Ingredient> ingredients, List<Comment> comments, Double rate, User owner,
                  List<Instruction> intructions) {
		super();
		this.id = id;
		this.ingredients = ingredients;
		this.comments = comments;
		this.rate = rate;
		this.owner = owner;
		this.instructions = intructions;
	}

	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public List<Instruction> getInstructions() {
		return instructions;
	}
	public void setInstructions(List<Instruction> intructions) {
		this.instructions = intructions;
	}

	public void addComment(Comment comment) {
		if (comments == null) {
			comments = Lists.newArrayList();
		}
		comments.add(comment);
	}
	public void addIngridients(Ingredient ingredient) {
		if (ingredients == null) {
			ingredients = Lists.newArrayList();
		}
		ingredients.add(ingredient);
	}

	public void addInstruction(Instruction instruction) {
		if (instructions == null) {
			instructions = Lists.newArrayList();
		}
		instructions.add(instruction);
	}
}
