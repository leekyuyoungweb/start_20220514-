<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>   <!-- 기본값 -->
<!DOCTYPE html>
<html>
<head>
<title>Directives Tag</title>
</head>
<body>
	<h2>contentType 디렉티브 태그</h2>
	<h4>text/html HTML 출력</h4>
	<h4>charset = utf8 : 문자인코딩</h4>
	<%
	new Date();
	%>
</body>
</html>