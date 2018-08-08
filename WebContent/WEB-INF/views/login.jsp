<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>COPS - HOME PAGE</title>
</head>
<body>
	<p><font color="red">${errorMessage}</font></p>
    
    <form action="/cops/login" method="POST">
        Name :     <input name="name"     type="text" value ="cops"/> <br>        
        Password : <input name="password" type="password" value="cops"/> <br>
        <input type="submit" />
    </form>
</body>
</html>