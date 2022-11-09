<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="text.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logged Member</title>
<header> <jsp:include page="/WEB-INF/frame1/header.jsp"></jsp:include>
</header>
<div>
</head>
<body>
	</br>
	</br>
	<TABLE class="table3">
		</br>
		</br>
		<tr>
			<td><h1>WELCOME
		</tr>
		</td>
		</br>
		</br>
		</br>
		</h1>
		<tr>
			<td><h1><%=session.getAttribute("username")%></h1>
		</tr>
		</td>
		<form method="post" action="LogoutServer">
			<tr>
				<td><button>
						<input type="submit" name="logout" value="Logout" id="rgtbtn2">
					</button></td></br>
			</tr>
			</br>
			</br>

			<tr>
				<td><a href="deleteAcc.jsp">Delete my Account</a> <br /></td>
			</tr>
			</br>
			</br>
		</form>

	</TABLE>
	</div>
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

