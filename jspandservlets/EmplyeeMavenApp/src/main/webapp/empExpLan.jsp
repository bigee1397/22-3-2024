<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.employeeapp.model.Employee, javax.servlet.http.HttpSession" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is the details of employee</h1>

		Employee Name: ${employeeObject.employeeName } <br/>
		Employee ID: ${employeeObject.emlpoyeeId } <br/>
		Employee Salary: ${employeeObject.employeeSalary } <br/>
		Employee City: ${employeeObject.employeeCity } <br/>
		${employeeObject.toString()} <br />
		${sessionScope.message1 } <br />
		${message } <br />
		${message1 }
</body>
</html>