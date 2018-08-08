<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Welcome to COPS</h1>
	<hr>
	<P>${serverTime}.</p>
	<hr>
	<P>${user}</p>
	
	<h2>ORDER PROCESSING</h2><br><a href ="/cops/auth/createaoe"> NEW AOE </a>

</body>
</html>