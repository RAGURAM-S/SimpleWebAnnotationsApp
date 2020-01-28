package com.ragu.learn.spring.core;

public class Employee {

	int id;
	String firstName;
	String lastName;
	String mailId;
	
	// alt + shift + s + s  --> overriding the toString method

	@Override
	public String toString() {
		return "Employee [id = " + id + ", firstName = " + firstName + ", lastName = " + lastName + ", mailId = " + mailId
				+ "]";
	}

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	

}
