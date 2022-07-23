<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>errorPage 디렉티브 태그</h4>
	에러가 발생했습니다.
	<h5>exception 재장 객체 변수</h5>
	<%
		exception.printStackTrace(new PrintWriter(out));
	%>
</body>
</html>