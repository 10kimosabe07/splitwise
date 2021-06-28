package com.splitwise.demo.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User {

	private int id;
	private String name;
	private String phNo;
	private String pwd;
	private Date createdDate;
	private Date updatedDate;
	private Set<Group> groups;
	private Set<Expense> expenses;
	
	public User(String name, String phNo, String pwd) {
		super();
		this.name = name;
		this.phNo = phNo;
		this.pwd = pwd;
		this.createdDate = new Date();
		this.updatedDate = new Date();
		this.groups = new HashSet<Group>();
		this.expenses = new HashSet<Expense>();
	}
	
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
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
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
	public Set<Group> getGroups() {
		return groups;
	}
	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}
	public Set<Expense> getExpenses() {
		return expenses;
	}
	public void setExpenses(Set<Expense> expenses) {
		this.expenses = expenses;
	}
	
}
