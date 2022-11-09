<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="text.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Coral Properties</title>
</head>
<body>
<header>
<jsp:include page="/WEB-INF/frame1/header.jsp"></jsp:include>
</header>
<div>
 
<div>
	<form method="post" action="AddpropertyServer" enctype="multipart/form-data">
	
	<table class="table">
	
	<tr><th><h1>Add a Property</h1></th></tr>
	<tr><td><b>Please Fill this Form to Add a Property</b></br></td></tr>
	<tr><td><b>Property Name </b></br><input type="text" name="name" required></td></tr></br>
	<tr><td><b>Brief Description about the Property and Contact Information </b></br><textarea rows="5" cols="64" name="description" required></textarea></td></tr></br>
	<tr><td><b>Upload the Image </b></br><input type="file" name="image"required></td></tr></br>
	<tr><td><input type="submit" name="submit" value="Submit" id="rgtbtn3"></td></tr>
	<tr><td><a href="newproperty.jsp"><b>Go To View Properties</b></a></td></tr>
	</table>
	
	</form>
	</div></br></br></br>

</div></br></br></br>
<footer>
<jsp:include page="/WEB-INF/frame1/footer.jsp"></jsp:include>
</footer>

</body>
</html>