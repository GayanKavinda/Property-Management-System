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
	</br>
	</br>
	</br>
	</br>
	</br>
	</br>

	<form method="post" action="forgotpwdServer">

		<table class="table">

			<tr>
				<th><br />Forgot Username or Pasword</th>
			</tr>
			<tr>
				<td><p id="c2">Enter your user name</p></td>
			</tr>
			<br />

			<tr>
				<td><b>User Name </b></br>
				<input type="text" name="name" required></td>
			</tr>
			</br>
			<tr>
				<td><input type="submit" name="login" value="Continue"
					id="rgtbtn"></td>
			</tr>
			<tr>
				<td><a href="login.jsp">Don't have an account</a> <br />
			</tr>
			</td>
		</table>
	</form>













	<footer>
	</br>
	</br>
	</br>
	</br>
	</br>
	</br>
	<jsp:include page="/WEB-INF/frame1/footer.jsp"></jsp:include> </footer>
</body>
</html>

