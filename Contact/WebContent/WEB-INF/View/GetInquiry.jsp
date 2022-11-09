<%@page import="com.contact.model.Inquiry"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="text.css" rel="stylesheet" type="text/css">
<link rel = "stylesheet"
   type = "text/css"
   href = "Reset.css" />
<meta charset="UTF-8">
<title>Property Management System</title>
</head>
<body>
<header>
<jsp:include page="/WEB-INF/frame1/header.jsp"></jsp:include>
</header>
	<h1>Contact Us</h1>
	
	<h2 class="h2">Get Inquiries Page</h2>

	
	<br>
	<br>
	<%
		Inquiry inquiry = (Inquiry) request.getAttribute("inquiry");
	%>

	<form method="POST" action="UpdateServlet">
		<table>
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" disabled="disabled"
					value="<%=inquiry.getId()%>" /></td>
			</tr>
			<tr>
				<td> Name</td>
				<td><input type="text" name="name"
					value="<%=inquiry.getName()%>" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"
					value="<%=inquiry.getEmail() %>" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="city"
					value="<%=inquiry.getCity()%>" /></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><input type="text" name="description"
					value="<%=inquiry.getDescription()%>" /></td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="hidden" name="id"
					value="<%=inquiry.getId()%>" /> <input type="submit"
					value="UPDATE" class="update-button"/></td>
			</tr>
		</table>
	</form>

	<table>
		<tr>
			<td colspan="2">
				<form method="POST" action="DeleteServlet">
					<input type="hidden" name="id"
						value="<%=inquiry.getId()%>" /> <input type="submit"
						value="DELETE" class="delete-button"/>
				</form>
			</td>
		</tr>
	</table>
	
	<br><br>
<footer>
<jsp:include page="/WEB-INF/frame1/footer.jsp"></jsp:include>
</footer>


</body>
</html>