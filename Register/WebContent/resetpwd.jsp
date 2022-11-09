<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="text.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reset Password</title>
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
	<form method="post" action="resetpwdServer">

		<table class="table">
			<tr>
				<td><b>New Password </b></br>
				<input type="password" name="npassword" required></td>
			</tr>
			</br>
			<tr>
				<td><b>Confirm Password</b></br>
				<input type="password" name="cpassword" required></td>
			</tr>
			</br>
			<tr>
				<td><input type="submit" name="register" value="Reset Password"
					id="rgtbtn"></td>
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
