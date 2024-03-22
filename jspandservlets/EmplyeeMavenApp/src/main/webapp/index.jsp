<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- name, id, salary, city, course,  -->
	<!--  -->
	<fieldset align="center">
	<form action="employeeServlet" method="post">
		Enter Employee name: <input type="text" name="employeeName" placeholder="Enter Employee name" /> 
    	<br><br>
    	Enter Employee ID: <input type="number" name="employeeId" placeholder="Enter City" /> 
    	<br><br>
    	Enter City: <input type="text" name="emlpoyeeCity" placeholder="Enter City" /> 
    	<br><br>
    	Enter Salary: <input type="number" name="emlpoyeeSalary" placeholder="Enter Salary" /> 
    	<br><br>
        <!-- Select Course: 
        <select name="employeeCourse">
            <option>--Select--</option>
            <option value="Java">Java</option>
            <option value="Spring">Spring</option>
            <option value="Angular">Angular</option>
            <option value="Node">Node</option>
        </select>
        <br><br> -->
       <!--  Hobbies
        <input type="checkbox" name="hobby" value="dance">Dance
        <input type="checkbox" name="hobby" value="music">Music
        <input type="checkbox" name="hobby" value="sports">Sports
        <input type="checkbox" name="hobby" value="reading">Reading
        <br><br> -->
        <input type="submit" value="Submit"> 
	</form>
	</fieldset>
</body>
</html>