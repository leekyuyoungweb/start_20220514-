<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="db.DbConn"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품수정</title>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<script type="text/javascript" src="./resources/js/validation.js"></script>
</head>
<body>
<%
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;	
	List<Map> listMap = new ArrayList<Map>();
	try{
		conn = DbConn.getConnection();
		stmt = conn.createStatement();
		String sql = "select * from product";
		rs = stmt.executeQuery(sql);
		while(rs.next()){
			Map<String,String> map = new HashMap<String,String>();
			map.put("filename", rs.getString("filename"));
			map.put("pname", rs.getString("pname"));
			map.put("pdesc", rs.getString("pdesc"));
			map.put("price", rs.getString("price"));
			map.put("productId", rs.getString("productId"));
			listMap.add(map);
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	}
	
%>	
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="jumbotron">
		<div class="container">
			<h1 class = "display-3">상품수정</h1>		
		</div>	
	</div>
	<div class="container">
		<div class="row" align="center">
			<c:forEach items="<%=listMap %>" var="list" >
				<div class="col-md-4">
					<img src="./resources/images/${list.filename}" style="width: 100%">
					<h3>${list.pname}</h3>
					<p>${list.pdesc}</p>
					<p>${list.price}</p>
					<a href="./updateProduct.jsp?id=${list.productId}" class="btn btn-success" role="button">수정</a>
				</div>
			</c:forEach>
		</div>
	</div>
	<jsp:include page="footer.jsp"/>
</body>
</html>