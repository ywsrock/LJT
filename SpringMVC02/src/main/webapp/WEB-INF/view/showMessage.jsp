<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

    
<html>
	<head>
		<meta charset="utf-8">
		<title>登録画面</title>
	</head> 
	<body>

	<form action="./post" method="post" id="">
		ユーザ名：
		<select name="UserID">
			<c:forEach items="${userMap}" var="current" varStatus="status">
				<option value="${current.key}">${current.value}</option>
			</c:forEach>
		</select>
		<br>
		<input type="submit" name="submit" value="submit">
	</form>
			</body>
</html>
