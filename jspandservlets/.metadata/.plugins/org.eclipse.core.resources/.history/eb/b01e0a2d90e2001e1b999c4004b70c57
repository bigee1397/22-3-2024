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
		double salary = emp.getEmployeeSalary();
		int id = emp.getEmlpoyeeId();
		String city = emp.getEmployeeCity();%>
		
		<%="Employee Name: " + name%><br />
		<%="Employee ID: " + id%><br />
		<%="Employee Salary: " + salary%><br />
		<%="Employee City: " + city%><br />
		<%=emp.toString()%>

</body>
</html>