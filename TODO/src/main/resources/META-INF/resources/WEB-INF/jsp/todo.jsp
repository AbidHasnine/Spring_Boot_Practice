<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<html>

	<head>
		<link rel="stylesheet" href="webjars/bootstrap/5.3.3/css/bootstrap.min.css">
	</head>

	<body>

		<div class="container">
			<div>Add a Todo to the List</div>

            <form action="add-todo" method="post">
                <div class="mb-3">
                    <label for="description" class="form-label">Description</label>
                    <input type="text" id="description" name="description" class="form-control" required>
                </div>
                <div class="mb-3">
                    <label for="targetdate" class="form-label">Target Date</label>
                    <input type="date" id="targetdate" name="targetdate" class="form-control" required>
                </div>
                <button type="submit" class="btn btn-success">Add Todo</button>
		</div>
		<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
	</body>

	</html>