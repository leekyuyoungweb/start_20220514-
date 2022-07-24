<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인처리 프로세스</h1>

<%
	// admin 1234 -- 로그인 성공  -- welcome 
	// 실패하면 해당 페이지에 머물러 있어라.
	String id =  request.getParameter("id").trim();
	String password = request.getParameter("password").trim();
	
%>		
<%= id %>		
<%= password %>


<c:set var="id" value="<%= id %>"></c:set>		
<c:set var="password" value="<%= password %>"></c:set>

<c:choose>
	<c:when test="${(id == 'admin') && (password == '1234')}">
		<jsp:forward page="../welcome.jsp"></jsp:forward>
	</c:when>
	<c:otherwise>
		<jsp:forward page="login.jsp"></jsp:forward>
	</c:otherwise>
</c:choose>

</body>
</html>