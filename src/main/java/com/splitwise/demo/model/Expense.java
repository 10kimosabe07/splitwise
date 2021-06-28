package com.splitwise.demo.model;

import java.util.HashMap;
import java.util.Set;

public class Expense {

	private int id;
	private String name;
	private String desc;
	private User createdBy;
	private Set<User> participants;
	private Double totalAmount;
	private HashMap<User, Double> amountPaid;
	private HashMap<User, Double> amountOwned;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	public Set<User> getParticipants() {
		return participants;
	}
	public void setParticipants(Set<User> participants) {
		this.participants = participants;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public HashMap<User, Double> getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(HashMap<User, Double> amountPaid) {
		this.amountPaid = amountPaid;
	}
	public HashMap<User, Double> getAmountOwned() {
		return amountOwned;
	}
	public void setAmountOwned(HashMap<User, Double> amountOwned) {
		this.amountOwned = amountOwned;
	}
	
}
