<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>COPS - HOME PAGE</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.jumbotron {
	background-color: #2E2D88;
	color: white;
}
</style>
</head>

<body>
	<div class="container">

		<div class="jumbotron">
			<h1>COPS - Equity Order management system</h1>
		</div>


		<div class="jumbotron">
			<form action="/cops/login" method="POST">


				<div class="form-group">
					<label for="user1">Cops Login ID</label> <input name="name"
						class="form-control" id="user1" placeholder="Enter user intial">${errorMessage}
					<small class="form-text text-muted">Please provide CGC
						provided user intial, like INYABC</small>
				</div>

				<div class="form-group">
					<label for="password1">Password</label> <input name="password" type="password"
						class="form-control" id="password1" placeholder="Password">
				</div>

				<button type="submit" class="btn btn-primary">Submit</button>
			</form>

		</div>
	</div>
	
	
	
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>