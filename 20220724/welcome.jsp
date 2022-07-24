<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쇼핑몰</title>
</head>
<body>
<%!
	String greeting = "쇼핑몰에 오신것을 환영합니다. ";
	String taglib = "Welcome to Web Market";
	String dateTime;
%>
<%
	Date day = new Date();
	String ampm;
	int hour = day.getHours();
	int minuts = day.getMinutes();
	int second = day.getSeconds();
	if(hour / 12 == 0){
		ampm = "오전";
	}else{
		ampm = "오후";
		hour -= 12;
	}
	dateTime = String.format("%s %d시 %d분 %d초 ", ampm,hour,minuts,second);	
%>


<%@ include file="menu.jsp" %>
<h1> <%=greeting %>  </h1>
<h3> <%=taglib %>  </h3>
<%= dateTime %>
<%@ include file="footer.jsp" %>





</body>
</html>