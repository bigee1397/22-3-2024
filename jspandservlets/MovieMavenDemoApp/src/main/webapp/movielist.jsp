<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%		
		out.print(session.getId() + "<br>");
		out.print(session.getMaxInactiveInterval()+"<br><br>");
		List<String> movies = (List<String>) session.getAttribute("langMovies");
		/* String username = (String) request.getAttribute("username"); */
		out.println("The list of movies are:<br>");
		for(String movie : movies) {
			out.print(movie + ", ");
		}
	%>
</body>
</html>