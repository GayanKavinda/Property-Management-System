<%@page import="com.contact.service.IContactUs"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.contact.service.ContactUslmpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.contact.model.Inquiry"%>
<!DOCTYPE html>
<html>
<head>
	<link href="text.css" rel="stylesheet" type="text/css">
	<link rel = "stylesheet"
   type = "text/css"
   href = "Inquiry.css" />
   
<meta charset="ISO-8859-1">
<title>Successfully Submitted</title>
</head>
<body>
<header>
<jsp:include page="/WEB-INF/frame1/header.jsp"></jsp:include>
</header>
	
	<h1>Contact Us</h1>
	
	

<a href="index.jsp" style="color:#2BD4E1">Add Inquiry</a>


<br><%
		Inquiry inquiry = (Inquiry) request.getAttribute("inquiry");
	%>
			
			<br><table border="1" cellpadding="12" bordercolor="red">
	<tr bgcolor="red">
		<th>Name</th>
		<th>Email</th>
		<th>City</th>
		<th>Description</th>
	</tr>
		
	<tr bgcolor="red">
		<td><%=inquiry.getName() %></td>
		<td><%=inquiry.getEmail() %></td>
		<td><%=inquiry.getCity() %></td>
		<td><%=inquiry.getDescription() %></td>
	</tr>
			
	
		
</table>

		<h2>THANKS FOR CONTACTING US!!!!</h2>
		
		<a href="https://www.facebook.com" target="_blank">
	<img src="Resources/1000px-F_icon.svg_-1.png">
	<i class="fa fa-facebook-squre">
</i></a><br>

<a href="https://www.google.com" target="_blank">
	<img src="Resources/g+_logo_png_545362.png" >
	<i class="fa fa-google-squre">
</i></a><br>

<a href="https://www.twitter.com" target="_blank">
	<img src="Resources/twitter-512.png" >
	<i class="fa fa-twitter-squre">
</i></a><br>
	<footer>
<jsp:include page="/WEB-INF/frame1/footer.jsp"></jsp:include>
</footer>
		
		
</body>
</html>