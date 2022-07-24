<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 구구단 2단 출력 -->
<%
	for(int i = 1; i<10; i++){		
		out.println(String.format("2 x %d = %d", i, 2*i) );
	}
%>
<br><br>

<c:forEach begin="1" end="9" step="1" var="i">
	<c:out value="2 x ${i}  =  ${2*i}"></c:out>
</c:forEach>
<br><br>

</body>
</html>