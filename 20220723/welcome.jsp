<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<%! 
		String greeting = "Welcome to Web Shopping Mall";
		String tagline = "Welcome to Web Market!";	
	%>
	
	<h1>
		<%=greeting %>
	</h1>
	<h3>
		<%= tagline %>
	</h3>
	
</body>
</html>