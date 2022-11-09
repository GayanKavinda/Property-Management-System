<%@page import="com.contact.model.Inquiry"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.contact.service.ContactUslmpl"%>
<%@page import="com.contact.service.IContactUs"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="text.css" rel="stylesheet" type="text/css">
<link rel = "stylesheet"
   type = "text/css"
   href = "Reset.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Property Management</title>
</head>
<body>
<header>
<jsp:include page="/WEB-INF/frame1/header.jsp"></jsp:include>
</header>

	<h1>Contact Us</h1>
	
	<h3>List of Inquries</h3>
	
	<br>
	<br>
	  <div align="left">
		<table border="1" cellpadding="12" bordercolor="red">
		 <caption><h2>List of Inquries</h2></caption>
		 <a href="index.jsp" style="color:#2BD4E1">Add Inqiury</a>
		  <tr>
         <tr bgcolor="red">
		<th>Name</th>
		<th>Email</th>
		<th>City</th>
		<th>Description</th>
		<th>Selection</th>
	</tr>
	
		
            <%
            IContactUs iContactUs = new ContactUslmpl();
			ArrayList<Inquiry> arrayList = iContactUs.getInquiries();
			
			for(Inquiry inquiry : arrayList){
			%>
			 <tr bgcolor="red">
		
		<td><%=inquiry.getName() %></td>
		<td><%=inquiry.getEmail() %></td>
		<td><%=inquiry.getCity() %></td>
		<td><%=inquiry.getDescription() %></td>
		<td> 
				<form method="POST" action="GetServlet">
				<input type="hidden" name="id" value="<%=inquiry.getId()%>"/>
				 <input type="submit" value= "SELECT" class="select-button" /> 
				 </form>
				 </td>	
	</tr>	
			<%	
			   }
            %>     
		</table>
		</div>
		
		<br><br>
		<footer>
<jsp:include page="/WEB-INF/frame1/footer.jsp"></jsp:include>
</footer>
		
</body>
</html>