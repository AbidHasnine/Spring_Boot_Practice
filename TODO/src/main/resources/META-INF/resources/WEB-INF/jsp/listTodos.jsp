<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<html>

	<head>
		<link rel="stylesheet" href="webjars/bootstrap/5.3.3/css/bootstrap.min.css">
	</head>

	<body>
		<!-- <h1>
			I Like Spring Boot you JSP!
		</h1> -->

		<!-- <div>Here are your Todos : ${todos}</div> -->
		<div class="container">
			<div>Welcome to Todo List</div>
			<table class="table">

				<thead>
					<tr>
						<th>id</th>
						<th>description</th>
						<th>Target date</th>
						<th>is done?</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.id}</td>
							<td>${todo.description}</td>
							<td>${todo.targetdate}</td>
							<td>${todo.done}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="add-todo" class="btn btn-primary">Add Todo</a>
		</div>
		<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
	</body>

	</html>