package com.studentmanagement.bean;

public class User {
	
	private int Id ;
	private String name ; 
	private String department ;
	private String country ;
	
	
	public User(String name, String department, String country) {
		super();
		this.name = name;
		this.department = department;
		this.country = country;
	}
	public User(int id, String name, String department , String country) {
		super();
		Id = id;
		this.name = name;
		this.department = department;
		this.country = country;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department ;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
