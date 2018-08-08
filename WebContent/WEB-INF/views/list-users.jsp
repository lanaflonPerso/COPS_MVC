<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Todos for ${name}</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<H1>COPS USERS</H1>
logged in user : ${sessionUser}
<hr>
 
<div class="container">

		<table class="table table-striped">
			<caption>ALL COPS USERS</caption>

			<thead>
				<tr>
					<th>Name</th>
					<th>Initials</th>
					<th>Role</th>
					<th>location</th>
					<th>Active from</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${users}" var="user">
					<tr>
						<td>${user.userName}</td>
						<td>${user.initial}</td>
						<td>${user.role}</td>
						<td>${user.location}</td>
						<td>${user.createDate}</td>
						
  						<td>  <a type="button" class="btn btn-warning" href="/cops/delete-users?id=${user.initial}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a type="button" class="btn btn-success" href="/cops/add-users">Add</a>
		</div>
		
	</div>
 
 
 <br>

  
  <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
  <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    
</body>
</html>