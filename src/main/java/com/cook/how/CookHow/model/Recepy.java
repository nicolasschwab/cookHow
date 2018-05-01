package com.cook.how.CookHow.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.assertj.core.util.Lists;

public class Recepy {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private List<Ingridient> ingridients;
	private List<Instruction> instructions;
	private List<Comment> comments;
	private Double rate;
	private User owner;

	public Recepy(Long id, List<Ingridient> ingridients, List<Comment> comments, Double rate, User owner,
			List<Instruction> intructions) {
		super();
		this.id = id;
		this.ingridients = ingridients;
		this.comments = comments;
		this.rate = rate;
		this.owner = owner;
		this.instructions = intructions;
	}

	public Recepy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Ingridient> getIngridients() {
		return ingridients;
	}
	public void setIngridients(List<Ingridient> ingridients) {
		this.ingridients = ingridients;
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
	public void addIngridients(Ingridient ingridient) {
		if (ingridients == null) {
			ingridients = Lists.newArrayList();
		}
		ingridients.add(ingridient);
	}

	public void addInstruction(Instruction instruction) {
		if (instructions == null) {
			instructions = Lists.newArrayList();
		}
		instructions.add(instruction);
	}
}
