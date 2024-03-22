<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.doctorapp.model.Doctor" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Doctor</title>
<link rel="stylesheet" href="../../css/styles.css">
</head>
<body>
	<div>
		<h1>Getting a Doctor Record</h1>
		<a href="/"><button>Go back to Home Page</button></a>
	</div>
	<hr>
	<fieldset>
		<legend align="center">Update Doctor</legend>
		<form action="updateDoctor" method="post">
			<table align="left" border="1">
				<tr>
					<td>Enter Doctor ID</td>
					<td><input type="number" name="doctorId" placeholder="Enter Doctor ID" value="${doctorObj.doctorId }" readonly  /> </td>
				</tr>
				<tr>
					<td>Enter Doctor Name</td>
					<td><input type="text" name="docName" placeholder="Enter Doctor Name" value="${doctorObj.doctorName }" readonly /> </td>
				</tr>
				<tr>
					<td>Select Speciality</td>
					<td>
						<select name="speciality" readonly>
				            <option>${doctorObj.speciality }</option>
			        	</select>
			        </td>
				</tr>
				<tr>
					<td>Enter Consultation Fees</td>
					<td><input type="number" name="consultationFees" placeholder="Enter Consultation Fees"  value="${doctorObj.consultationFees }"/> </td>
				</tr>
				<tr>
					<td>Enter Experience</td>
					<td><input type="text" name="experience" placeholder="Enter Doctor Experience" value="${doctorObj.experience }" readonly/> </td>
				</tr>
				<tr>
					<td>Enter Ratings</td>
					<td><input type="number" name="ratings" placeholder="Enter Doctor Ratings" value="${doctorObj.ratings }" readonly /> </td>
				</tr>
				<tr>
					<td colspan=2><input type="submit" value="Submit">
					<input type="reset" value="Reset"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>