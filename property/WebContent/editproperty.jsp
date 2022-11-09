<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Coral Properties</title>
</head>
<body>
	<header>
	<link href="text.css" rel="stylesheet" type="text/css">
	<jsp:include page="/WEB-INF/frame1/header.jsp"></jsp:include> </header>
	<div>

		<table id="details">

			<tr>
				<td><%=request.getAttribute("propertyname")%>
			</tr>
			</td>
			<form method="post" action="EditpropertyServer">
				<tr>
					<td><b>Edit Your Brief Description about the Property and
							Contact Information <input type="hidden"
							value="<%=request.getAttribute("propertyname")%>" name="name">
					</b></br>
					</br>
					<textarea rows="10" cols="64" name="description" required><%=request.getAttribute("propertydescription")%></textarea></td>
				</tr>
				</br>
				</br>
				</br>
				</br>
				</td>
				</tr>


				<tr>
					<td><input type="submit" name="submit" value="Submit"
						id="rgtbtn3"></td>
				</tr>
				<tr>
					<td><a href="newproperty.jsp"><b>Go To View Properties</b></a></td>
				</tr>

			</form>





		</table>


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
	</br>
	</br>
	</br>
	<footer> <jsp:include page="/WEB-INF/frame1/footer.jsp"></jsp:include>
	</footer>





</body>
</html>