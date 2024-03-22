<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="indexHeader">
		<a href="admin"><button>Admin Login</button></a>
	</div>
	
	<fieldset>
		<legend align="center">Options</legend>
		<form action="searchDoctor">
				<table align="left" border="1">
					<tr>
						<td><input type="text" name="speciality" placeholder="Enter speciality you want to search...." width="200px" /></td>
						<td><input type="submit" value="Search" /> </td>
					</tr>
				</table>
			</form>
	</fieldset>
	
	<h2>All Doctors</h2>
	${message }
</body>
</html>