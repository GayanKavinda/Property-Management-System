<%@page import="feedback.Feedback"%>
<%@page import="methods.feedbackcrud"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel='stylesheet' type='text/css' href='css/resetAndsubmit.css'>
<link rel='stylesheet' type='text/css' href='css/style.css'>

<link rel='stylesheet' type='text/css' href='css/submit.css'>
<link rel='stylesheet' type='text/css' href='css/form.css'>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Coral Properties</title>
</head>
<body>
<jsp:include page="/WEB-INF/frame1/header.jsp"></jsp:include><br><br><br><br>
<%
Object ob1=request.getAttribute("feedback");
Feedback ob=(Feedback) ob1;
%>
<div class="fnme">
	<form name="feedBackCover" method="post" action="UpdateFeedbackServlet2">
	
	<input type="hidden" name="custID" value=<%=ob.getCustomerID()%> >
	
	<h2 class="h2">Update Feed Back Form</h2>
	<hr>
	
	<div class="lable">Name :<span>*</span>
	<input type="text" name="name" placeholder="Ex-Edwad Ranasinghe" value="<%=ob.getCustomerName()%>" required><br><br>
	</div>
				

	<div class="lable">Email Address :<span>*</span>
	<input type="text" name="mail" value="<%=ob.getCustomerMail()%>"  required><br><br>
	</div>
		
	<div class="lable">How did you find this site? :<span>*</span>
	<select name="selection" required>
	<option name="selection">Select one.</option>
	<option name="selection">From another Website</option>
	<option name="selection">From a Friend</option>
	<option name="selection">From an Email</option>
	<option name="selection">From any Other way</option>
	</select>
	</div>
	<br>
		
	<div class="lable">How did you rate CORAL PROPERTIES?<span>*</span><br>
	
	<label><input type="radio" name="rateValue" value="Excellent">Exellent</label><br>
	<label><input type="radio" name="rateValue" value="VeryGood">VeryGood</label><br>
	<label><input type="radio" name="rateValue" value="Good">Good</label><br>
	<label><input type="radio" name="rateValue" value="Avreage">Average</label><br>
	<label><input type="radio" name="rateValue" value="poor">Poor</label><br>
	
	</div>
	<br>
		
	<div class="lable">Comments or Suggestions:<span>*</span>
	<textarea name="comment" rows="6" cols="40" required><%=ob.getComment()%></textarea><br><br>
	</div>
	
	<img src="images/robot/robott.gif" alt="Flowers in Chania" align="center">
	<br><br>
	
	<button class="btn submit">SUBMIT</button>
	
	</form><br><br><br><br>
	
<footer>
<jsp:include page="/WEB-INF/frame1/footer.jsp"></jsp:include>
</footer>

</body>
</html>