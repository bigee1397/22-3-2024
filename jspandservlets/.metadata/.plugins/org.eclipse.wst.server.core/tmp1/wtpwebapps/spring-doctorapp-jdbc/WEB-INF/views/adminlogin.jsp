<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administration Login</title>
<link rel="stylesheet" href="../../css/styles.css">
</head>
<body>
	<div>
		<h1>Admin Login</h1>
		<a href="/"><button>Go back to Home Page</button></a>
	</div>
	<hr>
	<fieldset>
		<legend align="center">Options</legend>
		<form action="login" method="post">
				<table align="left" border="1">
					<tr>
						<td>Enter Username:</td>
						<td><input type="text" name="username" placeholder="Enter username" /> </td>
					</tr>
					<tr>
						<td>Enter Password: </td>
						<td><input type="password" name="password" placeholder="Enter password" /></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="Submit" /></td>
					</tr>
				</table>
			</form> 	
	</fieldset>
</body>
</html>