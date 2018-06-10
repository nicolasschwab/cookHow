package com.cook.how.CookHow.dto;

import java.io.Serializable;
import java.util.List;

import com.google.common.collect.Lists;


public class Recipe implements Serializable{

	private static final long serialVersionUID = -680831060232783708L;
	
	public Long id;
	public List<Ingredient> ingredients;
	public List<Instruction> instructions;
	public List<Comment> comments;
	public Double rate;
	public User owner;

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
