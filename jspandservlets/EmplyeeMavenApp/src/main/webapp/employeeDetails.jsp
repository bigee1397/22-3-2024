<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.employeeapp.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is the details of employee</h1>
	<% 
		Employee emp = (Employee)request.getAttribute("employeeObject");
		String name = emp.getEmployeeName();
		String city = emp.getEmployeeCity();
		double salary = emp.getEmployeeSalary();
		int id = emp.getEmlpoyeeId();
		/* String course = emp.getEmployeeCourse(); */
		
		out.println("Employee Name: " + name + "<br />");
		out.println("Employee ID: " + id + "<br />");
		out.println("Employee Salary: " + salary + "<br />");
		out.println("Employee City: " + city + "<br />");/* 
		out.println("Employee Course: " + course + "<br />"); */
		out.println(emp.toString());
	%>
</body>
</html>