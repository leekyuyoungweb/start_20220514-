<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<script type="text/javascript" src="./resources/js/validation.js"></script>
<!-- <link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"> -->
<meta charset="UTF-8">
<title>상품등록</title>
</head>
<body>
<fmt:setLocale value='<%= request.getParameter("language")%>'/>
<fmt:bundle basename="com.bundle.myBundle">	
<jsp:include page="menu.jsp"></jsp:include>
	<div class="jumbotron">
		<div class="container">
			<h1 class = "display-3"><fmt:message key="title" /></h1>		
		</div>	
	</div>
	<div class="container">
		<div class="text-right">
			<a href="?language=ko">korean</a>|<a href="?language=en">English</a>
		</div>
		<form action="processAddProduct.jsp" name='addProductForm' 
		class = "form-horizontal" method="post" enctype="multipart/form-data">
			<div class="form-group row">
				<label class= "col-sm-2">상품 코드</label>
				<div class="col-sm-3">
					<input type="text" id ='productId'  name="productId" class="form-control">
				</div>
			</div>
			
			<div class="form-group row">
				<label class= "col-sm-2">상품명</label>
				<div class="col-sm-3">
					<input type="text" id='pname' name="pname" class="form-control">
				</div>
			</div>
			
			<div class="form-group row">
				<label class= "col-sm-2">가격</label>
				<div class="col-sm-3">
					<input type="text" id='price' name="price" class="form-control">
				</div>
			</div>
			
			<div class="form-group row">
				<label class= "col-sm-2">상세정보</label>
				<div class="col-sm-3">
					<input type="text" name="desc" class="form-control">
				</div>
			</div>
			
			<div class="form-group row">
				<label class= "col-sm-2">제조사</label>
				<div class="col-sm-3">
					<input type="text" name="manufacturer" class="form-control">
				</div>
			</div>
			
			<div class="form-group row">
				<label class= "col-sm-2">분류</label>
				<div class="col-sm-3">
					<input type="text" name="category" class="form-control">
				</div>
			</div>
			
			<div class="form-group row">
				<label class= "col-sm-2">재고 수</label>
				<div class="col-sm-3">
					<input type="text" id='unitStock' name="unitStock" class="form-control">
				</div>
			</div>
			
			<div class="form-group row">
				<label class= "col-sm-2">상태</label>
				<div class="col-sm-5">
					<input type="radio" name="condition" value="new" checked="checked">신품
					<input type="radio" name="condition" value="old" >중고품
					<input type="radio" name="condition" value="refurbished" >재생품
				</div>
			</div>
			
			<!-- 이미지등록 -->
			<div class="form-group row">
				<label class= "col-sm-2">이미지</label>
				<div class="col-sm-5">
					<input type="file" name="filename" class = 'form-control'>					
				</div>
			</div>
			
			<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="button" value="등록" class="btn btn-primary" onclick="checkAddProduct(addProductForm)">
				</div>
			</div>
		</form>
	</div>
	</fmt:bundle>
</body>
</html>