package com.ragu.learn.spring.core;

public class EmployeeDAO {

	Employee generateEmpId(Employee e) {
		System.out.println("Generation of Employee Id");
		int genEmpId = (int) (Math.random() * 2000);

		System.out.println(e);
		e.setId(genEmpId);
		System.out.println(e);
		
		return e;
	}

}
