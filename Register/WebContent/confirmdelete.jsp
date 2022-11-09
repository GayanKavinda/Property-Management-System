<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="text.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirm Delete</title>
</head>
<body>
	<header> <jsp:include page="/WEB-INF/frame1/header.jsp"></jsp:include>
	</header>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div>
		<form method="post" action="deleteServer">

			<table class="table">

				<tr>
					<th>Confirm Account Deletion<br /></th>
				</tr>
				<p id="c2"></p>
				<br />

				<tr>
					<td>Are you sure you wan't to delete this Account?</td>
				</tr>
				<tr>
					<td><a href="member.jsp">Instead of deleting you can
							Logout</a></td>
				</tr>
				<tr>
					<td><input type="submit" name="delete"
						value="Delete My Account" id="rgtbtn"></td>
				</tr>
				<tr>
					<td><a href="member.jsp">Back to my Account</a> <br />
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
	<footer> </br>
	</br>
	</br>
	</br>
	</br>
	</br>
	<jsp:include page="/WEB-INF/frame1/footer.jsp"></jsp:include> </footer>

</body>
</html>

