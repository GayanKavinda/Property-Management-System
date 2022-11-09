<%@page import="feedback.Feedback"%>
<%@page import="methods.feedbackcrud"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="text.css" rel="stylesheet" type="text/css">
<title>Coral Properties</title>
</head>
<body>
<header>
<jsp:include page="/WEB-INF/frame1/header.jsp"></jsp:include>
</header>
<%

List<Feedback> ob=new ArrayList<>();
ob=feedbackcrud.getAllFeedbacks();
Feedback s[] = new Feedback[ob.size()];
ob.toArray(s);
%>
<table class="table" border="1px" width='100%'>
<th>
<td>Customer Name</td>
<td>Customer Mail</td>
<td>How did you find this site?</td>
<td>How did you rate CORAL PROPERTIES?</td>
<td>Comments</td>
</th><br><br>
<%
	for(int i=0;i<=ob.size()-1;i++){
%>
<tr>
<td><%=s[i].getCustomerID()%></td>
<td><%=s[i].getCustomerName()%></td>
<td><%=s[i].getCustomerMail()%></td>
<td><%=s[i].getAnsForQuestion1()%></td>
<td><%=s[i].getAnsForQuestion2()%></td>
<td><%=s[i].getComment()%></td>
<td><a href="DeleteFeedbackServlet?custID=<%=s[i].getCustomerID()%>"> Delete </a></td>
<td><a href="UpdateFeedbackServlet?custID=<%=s[i].getCustomerID()%>"> Edit </a></td>

<% }%><tr><br>

</table>

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<footer>
<jsp:include page="/WEB-INF/frame1/footer.jsp"></jsp:include>
</footer>

</body>
</html>