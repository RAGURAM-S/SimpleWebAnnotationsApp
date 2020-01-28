package com.ragu.web.annotations;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ragu.learn.spring.core.Employee;
import com.ragu.learn.spring.core.EmployeeService;
import com.ragu.learn.spring.core.StandardEmployeeService;


/**
 * Servlet implementation class EServlet
 */
@WebServlet("/generateEmp")
public class EServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("GET");
		System.out.println("EmployeeServlet.doGet()");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		System.out.println("Received values are " + firstName + " " + lastName);
		
		Employee emp = new Employee(firstName, lastName);
		
		EmployeeService service = new StandardEmployeeService();
		service.generateMail(emp);
		System.out.println(emp);
		
		request.setAttribute("empId", emp.getId());
		request.setAttribute("empName", emp.getFirstName() + " " + emp.getLastName());
		request.setAttribute("empMailID", emp.getMailId());
		
		request.getRequestDispatcher("/WEB-INF/views/EmpDetails.jsp").forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("POST");
		System.out.println("EmployeeServlet.doPost()");
		
	}

}
