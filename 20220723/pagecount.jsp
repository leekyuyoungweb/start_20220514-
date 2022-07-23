<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%! int count = 0; %>
<body>
<h1>Page Count is :</h1>

<!-- _jspService 메소드안에 작성되고 jsp를 호출하면 _jspService메소드를 실행함 -->
<%
out.println(++count);
%>

</body>
</html>