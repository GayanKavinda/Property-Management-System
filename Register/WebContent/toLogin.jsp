<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="text.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<header> <jsp:include page="/WEB-INF/frame1/header.jsp"></jsp:include>
	</header>
	<div>
		<form method="post" action="loginServer">

			<table class="table">

				<tr>
					<th>Login<br /></th>
				</tr>
				<p id="c2"></p>
				<br />
				<script>document.getElementById("c2").innerHTML=("<%request.getAttribute("msg");%>
					")
				</script>
				<tr>
					<td><b>User Name </b></br>
					<input type="text" name="name" required></td>
				</tr>
				</br>
				<tr>
					<td><b>Password </b></br>
					<input type="password" name="password" required></td>
				</tr>
				</br>
				<tr>
					<td><input type="submit" name="login" value="login"
						id="rgtbtn"></td>
				</tr>
				<tr>
					<td><a href="login.jsp">Don't have an account</a> <br /> <a
						href="forgotpwd.jsp">Forgot Username or Password</a>
				</tr>
				</td>
			</table>
		</form>
	</div>
	</br>
	</br>
	</br>
	</br>
	</br>
	</br>
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
