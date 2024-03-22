<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		pageContext.setAttribute("message", "welcome");
		request.setAttribute("message", "welcome to request");
		session.setAttribute("message", "welcome to session");
		application.setAttribute("message", "welcome to application");
	%>
	
	<h2>Using Scripting</h2>
	${message } <br>
	${requestScope.message } <br>
	${sessionScope.message } <br>
	${applicationScope.message } <br>
	
	
	<% List<String> fruits = Arrays.asList("kiwi","apple","guava","mango","banana"); 
		session.setAttribute("fruitsList", fruits);
	%>
	
	<h2>Using EL</h2>
	${fruitsList }
	
	<h2>Using c:forEach</h2>
	<c:forEach items="${fruitsList }" var="fruit" step="1" >
	${fruit}<br />
	</c:forEach>
	
</body>
</html>