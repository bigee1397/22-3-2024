<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administration Dashboard</title>
<link rel="stylesheet" href="../../css/styles.css">
</head>
<body>	
	<div>	
		<h1 style="">Admin Dashboard</h1>
		<a href="/" style="padding-right: 20px;"><button>Go back to Home Page</button></a>
	</div>
	<hr>
	<fieldset>
		<legend align="center">Options</legend>
			<table align="left" border="1">
				<tr>
					<td>Add Doctor</td>
					<td><a href="add-doctor-form"><button>Add a Doctor</button></a></td>
				</tr>
				<tr>
					<td>Update Doctor Fees using ID</td>
					<td><a href="edit-doctor-form"><button>Update Doctor</button></a></td>
				</tr>
				<tr>
					<td>Delete Doctor Record</td>
					<td><a href="delete-doctor-form"><button>Delete Doctor</button></a></td>
				</tr>
			</table>
	</fieldset>
</body>
</html>