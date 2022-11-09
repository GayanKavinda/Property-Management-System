<%@page import="model.property"%>
<%@page import="service.propertymethodimpl"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.Blob"%>
<%@ page import="java.io.*"%>
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

		<table class="table">
			<tr>
				<td>
					<%
						property p = new property();
						propertymethodimpl ob = new propertymethodimpl();
						//System.out.print(ob.displayProperties1());
					%> <%
 	int m = ob.count();

 	ArrayList ob1 = new ArrayList();
 	String s[] = new String[m];
 	ob1 = ob.displayPropertiesname();
 	ob1.toArray(s);

 	ArrayList ob2 = new ArrayList();
 	String s2[] = new String[m];
 	ob2 = ob.displayPropertiesdescription();
 	ob2.toArray(s2);
 %><div id="details1">
						<%
							for (int i = 0; i < m; i++) {
						%><div class="t1">
							<div id="btn1">
								<h2>
									<%=s[i]%></h2>
							</div>
							<br />
							<br />
							<%
								String x = s[i];
							%>
							<!-- displaying the image -->

							<img src="ImageRetrieveServlet?id=<%=x%>" width="95%"
								height="260px" border="1"><br />
							<br />

							<%=s2[i]%><br />
							<br />
						</div>
						<%
							}
						%>
					</div>
					<br />
				<br />
				<br />
				<br />
				<br />
				<br />
			</tr>
			</td>



		</table>


	</div>
	</br>
	</br>
	</br>
	<footer> <jsp:include page="/WEB-INF/frame1/footer.jsp"></jsp:include>
	</footer>

</body>
</html>