<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scripting</title>
</head>
<body>
<%-- <% %>  스크립틀릿 : 자바코드를 작성하는데 사용 --%>
<%-- <%! %> 선언문 : 자바의 변수나 메소드를 정의 --%>
<%-- <%= %> 표현문 : 변수, 계산식, 메소드 호출 결과를 문자열 형태로 출력 --%>

<%!   
// 전역 변수나 메소드
int count = 3;
String makeItLower(String data){
	return data.toLowerCase();
}
%>

<%
for(int i = 0; i<count; i++){
	String str = String.format("<h1>Java Server Page %d </h1><br>", i);
	out.println(str);
}
%>

<%= makeItLower("<h3>Hello World</h3>") %>

</body>
</html>