<%@page import="java.util.Calendar"%>
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
	name = URLEncoder.encode("오늘의 날자와 시간");
%>

<!-- jsp:forward 액션테그에 데이터를 전달 -->

<body>
	<h3>param 액션 태그</h3>
	
	<jsp:include page="param2_data.jsp">
		<jsp:param value="<%=Calendar.getInstance().getTime() %>" name="date"/>
		<jsp:param value="<%=name %>" name="title"/>
	</jsp:include>
	
</body>
</html>