<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Doctor</title>
<link rel="stylesheet" href="../../css/styles.css">
</head>
<body>
	<div>
		<h1>Deleting a Doctor Record</h1>
		<a href="/"><button>Go back to Home Page</button></a>
	</div>
	<hr>
	<fieldset>
		<legend align="center">Options</legend>
		<form action="deleteDoctor" method="post">
				<table align="left" border="1">
					<tr>
						<td><input type="number" name="doctorId" placeholder="Enter Doctor ID...." /></td>
						<td><input type="submit" value="Delete" /> </td>
				</table>
			</form> 	
	</fieldset>
</body>
</html>