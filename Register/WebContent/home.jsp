<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="text.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Coral Properties</title>
</head>
<body>

	<%
		if (session.getAttribute("username") == null) {

			String redirectURL = "http://localhost:8080/Register/index.jsp";
			response.sendRedirect(redirectURL);
		} else {
			String redirectURL = "http://localhost:8080/Register/member.jsp";
			response.sendRedirect(redirectURL);
		}
	%>
</body>
</html>


