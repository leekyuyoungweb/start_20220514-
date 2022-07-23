<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int count = 0;
	void addCount(){
		count++;
	}
%>    

<%
	addCount();
%>
<P>
	이 사이트의 방문은 <%=count %> 번째입니다.
</P>



