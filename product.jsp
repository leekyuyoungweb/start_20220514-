<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="db.DbConn"%>
<%@page import="repository.ProductRepository"%>
<%@page import="entity.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="exceptionNoProduct.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<!-- <link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"> -->
<%-- <jsp:useBean id="productDAO" class="repository.ProductRepository" scope="session"></jsp:useBean> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>

<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품목록</h1>		
		</div>	
	<div class="contailner">
	</div>
		<div class="row" align="center">
<%
	Connection conn =  null;	
	Statement stmt = null;	
	ResultSet rs = null;
	try{
		conn = DbConn.getConnection();
		stmt = conn.createStatement();
		String sql = "select * from product";
		rs = stmt.executeQuery(sql);
		while(rs.next()){
%>		
			<div class="col-md-4">
				<img alt="<%=rs.getString("filename")%>" src="./resources/images/<%=rs.getString("filename") %>"					
				 style="width: 100%">
				<h3><%=rs.getString("pname") %></h3>
				<p><%=rs.getString("pdesc") %></p>
				<p><%=rs.getString("price") %></p>
				<p><a href="productdetail.jsp?id=<%=rs.getString("productId") %>" class = "btn btn-secondary" role="button">상세정보</a></p>
			</div>			
<%
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	}
%>			
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>