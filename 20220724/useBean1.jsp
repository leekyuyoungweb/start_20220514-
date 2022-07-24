<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<jsp:useBean id="date" class="java.util.Date"></jsp:useBean>
	오늘의 날자 및 시간<p><%=date %></p>
</body>
</html>


