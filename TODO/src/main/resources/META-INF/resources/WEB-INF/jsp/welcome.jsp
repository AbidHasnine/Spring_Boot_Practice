<%--
    This JSP file displays a welcome message to the user after they have successfully logged in.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
    <link rel="stylesheet" href="webjars/bootstrap/5.3.3/css/bootstrap.min.css">
    <title>Welcome</title>
</head>

<body>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6 text-center">
                <div class="welcome-container">
                    <h1>Welcome!</h1>
                    <p>Hello! Thanks for visiting our application. Get started by managing your todos.</p>
                    <%--
                        This displays the 'name' attribute from the model.
                        The value of 'name' is set in the loginController after successful authentication.
                    --%>
                    <div>Name: ${name}</div>
                    <div>
                        <%--
                            This is a link to the 'list-todos' page, styled as a Bootstrap button.
                        --%>
                        <a href="list-todos" class="btn btn-primary mt-3">Manage Your Todos</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
</body>

</html>