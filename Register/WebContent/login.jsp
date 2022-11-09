<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="text.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<header> <jsp:include page="/WEB-INF/frame1/header.jsp"></jsp:include>
	</header>
	<div>
		<form method="post" action="RegisterServer">

			<table class="table">

				<tr>
					<th>Register<br /></th>
				</tr>
				<tr>
					<td>Please Fill this Form to Register</br></td>
				</tr>
				<tr>
					<td><b>User Name </b></br>
					<input type="text" name="name" required></td>
				</tr>
				</br>
				<tr>
					<td><b>Email </b></br>
					<input type="email" name="email" required></td>
				</tr>
				</br>
				<tr>
					<td><b>Password </b></br>
					<input type="password" name="password" required></td>
				</tr>
				</br>
				<tr>
					<td><b>Confirm Password</b></br>
					<input type="password" name="cpassword" required></td>
				</tr>
				</br>
				<tr>
					<td><input type="submit" name="register" value="Register"
						id="rgtbtn"></td>
				</tr>
				<tr>
					<td><a href="toLogin.jsp">Already have an Account</a>
				</tr>
				</td>
			</table>
		</form>
	</div>
	</br>
	</br>
	</br>
	<footer> <jsp:include page="/WEB-INF/frame1/footer.jsp"></jsp:include>
	</footer>




</body>
</html>

