<%@ page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>SGP - App</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">	
	</head>
	<body>
		<h1>Les collaborateurs</h1>
		<ul>
		<%
		List<String>listeNoms = (List<String>)request.getAttribute("listeNoms");
		for (String nom : listeNoms) {
		%>
				<li><%=nom %></li>
		<%
		}
		%>
		</ul>
	</body>
</html>