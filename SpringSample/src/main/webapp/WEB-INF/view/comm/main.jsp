<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="login.do" method="post">
		<spring:message code="USERID_LABEL" text="아이디"/>
		<input type="text" id="userId" name="userId">
		<spring:message code="USERPW_LABEL" text="패스워드"/>
		<input type="password" id="userPw" name="userPw">
		<input type="submit" value="login">
	</form>
</body>
</html>