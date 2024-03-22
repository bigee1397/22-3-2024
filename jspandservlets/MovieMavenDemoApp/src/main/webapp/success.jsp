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
		String username = (String) session.getAttribute("username");
		out.println("Welcome " + username + "<br><br>");
		out.print(session.getId() + "<br>");
		out.print(session.getMaxInactiveInterval());
	%>
	<form action="movieServlet" method="post">	
	Select Language: 
        <select name="language">
            <option>--Select--</option>
            <option value="hollywood">Hollywood</option>
            <option value="tollywood">Tollywood</option>
            <option value="sandalwood">Sandalwood</option>
            <option value="bollywood">Bollywood</option>
        </select>
        <input type="submit" value="Login"> 
	</form>
</body>
</html>