<%--
    This JSP file provides the login page for the application.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
    The taglib directive declares the JSTL core library, used here to conditionally display an error message.
--%>
<html>

<head>
    <link rel="stylesheet" href="webjars/bootstrap/5.3.3/css/bootstrap.min.css">
    <title>Login</title>
</head>

<body class="bg-light">
    <div class="container d-flex justify-content-center align-items-center" style="height: 100vh;">
        <div class="card shadow" style="width: 400px;">
            <div class="card-body">
                <h1 class="card-title text-center mb-4">Welcome</h1>
                <%--
                    This block checks if the 'error' attribute is present in the model.
                    If it is, it displays the error message in a Bootstrap alert.
                    This is used to show "Invalid username or password" to the user.
                --%>
                <c:if test="${not empty error}">
                    <div class="alert alert-danger alert-dismissible fade show" role="alert">
                        ${error}
                        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                    </div>
                </c:if>
                <%--
                    This is the login form. When submitted, it sends a POST request to the "/login" URL.
                --%>
                <form action="/login" method="post">
                    <div class="mb-3">
                        <label for="name" class="form-label">Username</label>
                        <input type="text" id="name" name="name" class="form-control" required>
                    </div>
                    <div class="mb-3">
                        <label for="password" class="form-label">Password</label>
                        <input type="password" id="password" name="password" class="form-control" required>
                    </div>
                    <button type="submit" class="btn btn-primary w-100">Login</button>
                </form>
                <hr>
                <p class="text-center mb-0">
                    Don't have an account? <a href="/signup" class="link-primary">Sign up here</a>
                </p>
            </div>
        </div>
    </div>
    <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
</body>

</html>