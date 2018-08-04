<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>COPS TEST - FIRST PAGE</h1>
	<hr>
	<P>${serverTime}.</p>
	
	<p><h2>ORDER PROCESSING</h2><br><a href ="/cops/auth/createaoe"> NEW AOE </a></p>

	<form action="user" method="post">
		<input type="text" name="userName"><br> 
		<input type="submit" value="Login">
	</form>
	
</body>
</html>