<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorHandler.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>heyyyy</h1>
	<% 
		String empName = (String) request.getAttribute("employeeName");
		String empCity = (String) request.getAttribute("employeeCity");
	 	double salary = (Double) request.getAttribute("employeeSalary");
		String course = (String) request.getAttribute("employeeCourse");
		Long mobile = (Long) request.getAttribute("employeeMobile");
		String[] hobbies = (String[]) request.getAttribute("employeeHobbies"); 
		
		out.println("Employee Name: " + empName + "<br />");
		out.println("Employee City: " + empCity + "<br />");
		out.println("Employee Salary: " + salary + "<br />");
 		out.println("Employee Course: " + course + "<br />");
		out.println("Employee Mobile: " + mobile + "<br />");
		out.println("Hobbies are ");
		for(String hobby: hobbies)  
			out.print(hobby.toUpperCase() + " "); 
	%>
</body>
</html>