package com.example;

public class UserDetails {

	private String userId;
	private String name;
	private String designation;
	private double salary;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public UserDetails(String userId, String name, String designation, double salary) {
		super();
		this.userId = userId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	public UserDetails() {
		super();
	}
	
	
}
