<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String year = request.getParameter("birthyy");
	String month = request.getParameterValues("birthmm")[0];
	String day = request.getParameter("birthdd");
	String birth = year + "/" + month + "/" + day;
	String mail1 = request.getParameter("mail1");
	String mail2 = request.getParameterValues("mail2")[0];
	String mail = mail1 + "@" + mail2;
	String phone = request.getParameter("phone");
	String address = request.getParameter("address");
	
	DateFormat  df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Calendar cal =  Calendar.getInstance();
	String timestamp =  df.format(cal.getTime());

%>
<body>
	<sql:setDataSource var="dataSource"
		url="jdbc:mysql://localhost:3306/webmarketdb"
		driver="com.mysql.jdbc.Driver" user="admin" password="admin1234" />

	<sql:update dataSource="${dataSource}" var="resultSet">
   INSERT INTO member VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
   <sql:param value="<%=id%>" />
		<sql:param value="<%=password%>" />
		<sql:param value="<%=name%>" />
		<sql:param value="<%=gender%>" />
		<sql:param value="<%=birth%>" />
		<sql:param value="<%=mail%>" />
		<sql:param value="<%=phone%>" />
		<sql:param value="<%=address%>" />
		<sql:param value="<%=timestamp%>" />
	</sql:update>

	<c:if test="${resultSet>=1}">
		<c:redirect url="resultMember.jsp?msg=1" />
	</c:if>
</body>
</html>