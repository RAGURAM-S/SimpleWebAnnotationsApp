<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Page</title>
</head>
<body>

	Employee Name : <%= request.getAttribute("empName")%> <br>
	Employee Id : <%= request.getAttribute("empId") %> <br>
	Employee Mail Id : <%= request.getAttribute("empMailID") %>
</body>
</html>