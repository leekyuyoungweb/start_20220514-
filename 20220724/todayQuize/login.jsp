<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<form action="loginprocess.jsp" method="post">
		<p>
			아이디 : <input type="text" name="id">
		</p>
		<p>
			패스워드 : <input type="password" name="password">
		</p>
		<input type="submit" value="로그인">
	</form>
</body>
</html>