package com.ragu.learn.spring.core;

//import org.springframework.stereotype.Service;

//@Service

public class SpecialEmployeeService implements EmployeeService {

	public Employee generateMail(Employee e) {
		
		System.out.println("Generation of MailId");
		System.out.println(e);

		String mailId = e.getFirstName().substring(0, 1) + e.getLastName() + "@jda.com";
		e.setMailId(mailId);
		System.out.println(e);

		EmployeeDAO dao = new EmployeeDAO();
		return dao.generateEmpId(e);
	}
}
