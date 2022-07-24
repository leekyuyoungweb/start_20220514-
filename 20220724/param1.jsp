<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%! String name; %>
<%
	name = URLEncoder.encode("관리자");
%>

<!-- jsp:forward 액션테그에 데이터를 전달 -->

<body>
	<h3>param 액션 태그</h3>
	
	<jsp:forward page="param1_data.jsp">
		<jsp:param value="admin" name="id"/>
		<jsp:param value="<%=name %>" name="name"/>
	</jsp:forward>
	
</body>
</html>