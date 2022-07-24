<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String title = request.getParameter("title");
		title = URLDecoder.decode(title);
		String date = request.getParameter("date");
	%>
	<h3><%=title%> </h3>
	오늘은 : <%= date %>
</body>
</html>