package com.ragu.learn.spring.core;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

//@Component

public class EmployeeCRUD {
	
//	@Autowired	
	
//	constructor injection
	EmployeeService service;

//	overloaded constructor
	public EmployeeCRUD(EmployeeService service) {
	super();
	this.service = service;
}

	Employee createEmployee(Employee emp) {
		System.out.println("Creating Employee \n" + emp.getFirstName());
		
		return service.generateMail(emp);
	}
}
