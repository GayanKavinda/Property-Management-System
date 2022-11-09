<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="text.css" rel="stylesheet" type="text/css">
<link rel = "stylesheet"
   type = "text/css"
   href = "Index.css" />
   


<meta charset="ISO-8859-1">
<title>Contact Us</title>
</head>
<body>
<header>
<jsp:include page="/WEB-INF/frame1/header.jsp"></jsp:include>
</header>
	<h1>Contact Us</h1>
	
	
	<form method="post" action="ContactUsServlet">
		Name: <input type="text" name="name" placeholder="user name" required /> <br><br>
		Email: <input type="text" name="email" placeholder="email" required /> <br><br>
		City: <input type="text" name="city" placeholder="city" required /> <br><br>
		Description: <textarea name="description" placeholder="description" required > </textarea> <br><br>
		
		<tr>
				<td colspan="2"><input type="submit" value="ADD" class="add-button"/> <br/></td>
			</tr>
			<tr>	
				<td colspan="2"><input type="reset" value="RESET" class="reset-button" /></td>
			</tr>	
		
</form>

<form method="POST" action="ListServlet">
			<table>
				<tr>
					<td colspan="2"><input type="submit" value="LIST ALL" class="list-button" />
					</td>
				</tr>
			</table>
		</form>
 
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