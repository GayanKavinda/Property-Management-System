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
	<header> <jsp:include page="/WEB-INF/frame1/header.jsp"></jsp:include>
	</header>
	<div>


		<%
			if (session.getAttribute("username") == null) {
				String redirectURL = "http://localhost:8080/property/property.jsp";
				response.sendRedirect(redirectURL);

			} else if (session.getAttribute("username").equals("admin")) {
				String redirectURL = "http://localhost:8080/property/adminproperty.jsp";
				response.sendRedirect(redirectURL);
			} else {
				String redirectURL = "http://localhost:8080/property/property.jsp";
				response.sendRedirect(redirectURL);
			}
		%>




	</div>
	</br>
	</br>
	</br>
	<footer> <jsp:include page="/WEB-INF/frame1/footer.jsp"></jsp:include>
	</footer>

</body>
</html>

