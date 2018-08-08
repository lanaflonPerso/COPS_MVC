<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>COPS - HOME PAGE</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
	<p><font color="red">${errorMessage}</font></p>
    
    <form action="/cops/login" method="POST">
        Name :     <input name="name"     type="text" value ="cops"/> <br>        
        Password : <input name="password" type="password" value="cops"/> <br>
        <input type="submit" value="login" />
    </form>
 </div>>   
      <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
  <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>