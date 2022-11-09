<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="text.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forgot Password</title>
</head>
<body>
	<header> <jsp:include page="/WEB-INF/frame1/header.jsp"></jsp:include>
	</header>
	</br>
	</br>
	</br>
	<form method="post" action="forgotpwdrecoverServer">
		<table class="table">

			<h1>
				<tr>
					<td><b></b>
			</h1>
			</td>
			</tr>
			</br>
			<tr>
				<td><b>User Name</b></br>
				<input type="text" name="name"
					value=<%=request.getAttribute("usernameslist")%> required></td>
			</tr>
			</br>
			<tr>
				<td><b>Email </b></br>
				<input type="email" name="email" required></td>
			</tr>
			</br>
			<tr>
				<td><input type="submit" name="email" value="Submit"
					id="rgtbtn"></td>
			</tr>
			<tr>
				<td><a href="forgotpwd.jsp">Forgot Username or Password</a></td>
			</tr>
		</table>
	</form>
	</div>
	</br>
	</br>
	</br>
	</br>
	</br>
	</br>
	</br>
	</br>
	</br>
	</br>
	</br>
	</br>

	<footer> <jsp:include page="/WEB-INF/frame1/footer.jsp"></jsp:include>
	</footer>

</body>
</html>
