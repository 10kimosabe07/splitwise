package com.splitwise.demo.model;

import java.util.Date;
import java.util.Set;

public class Group {

	private int id;
	private String name;
	private String desc;
	private User admin;
	private Date createdDate;
	private Date updatedDate;
	private Set<User> participants;
	private Set<Expense> expenses;
	
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
	public User getAdmin() {
		return admin;
	}
	public void setAdmin(User admin) {
		this.admin = admin;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Set<User> getParticipants() {
		return participants;
	}
	public void setParticipants(Set<User> participants) {
		this.participants = participants;
	}
	public Set<Expense> getExpenses() {
		return expenses;
	}
	public void setExpenses(Set<Expense> expenses) {
		this.expenses = expenses;
	}

}
