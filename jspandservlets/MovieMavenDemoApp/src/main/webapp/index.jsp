<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset align="center">
		<form action="loginServlet" method="post">
			Enter User name: <input type="text" name="username" placeholder="Enter User name" /> 
	    	<br><br>
	    	Enter Password: <input type="password" name="password" placeholder="Enter Password" /> 
	    	<br><br>
	    	<!-- Enter Consultation Fees: <input type="number" name="consultationFee" placeholder="Enter Consultaion Fees" /> 
	    	<br><br>
	    	Enter Ratings: <input type="number" name="ratings" placeholder="Enter Doctor Ratings" /> 
	    	<br><br>
	    	Enter Experience: <input type="number" name="experience" placeholder="Enter Doctor Experience" /> 
	    	<br><br>
	        Select Speciality: 
	        <select name="speciality">
	            <option>--Select--</option>
	            <option value="ORTHOLOGIST">ORTHOLOGIST</option>
	            <option value="PEDIATRICS">PEDIATRICS</option>
	            <option value="TRICOLOGIST">TRICOLOGIST</option>
	            <option value="DERMATOLOGIST">DERMATOLOGIST</option>
	        </select>
	        <br><br>
	        Hobbies
	        <input type="checkbox" name="hobby" value="dance">Dance
	        <input type="checkbox" name="hobby" value="music">Music
	        <input type="checkbox" name="hobby" value="sports">Sports
	        <input type="checkbox" name="hobby" value="reading">Reading
	        <br><br> -->
	        <input type="submit" value="Login"> 
		</form>
	</fieldset>
</body>
</html>