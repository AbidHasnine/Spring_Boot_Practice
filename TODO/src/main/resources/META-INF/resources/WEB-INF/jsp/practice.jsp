<%--
    This JSP file is for practice and contains a simple form.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
    <link rel="stylesheet" href="webjars/bootstrap/5.3.3/css/bootstrap.min.css">
    <title>Document</title>
</head>

<body>
    <div class="container">
        <h1>Practice Form</h1>
        <%--
            This form submits a GET request to the "practice" URL.
            NOTE: There is a discrepancy between the form fields here (name, password)
            and the parameters expected by the practiceController (name, address, height).
            Submitting this form will likely cause an error.
        --%>
        <form action="practice" method="get">
            <div class="mb-3">
                <label for="name" class="form-label">Name:</label>
                <input type="text" id="name" name="name" class="form-control" required>
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Password:</label>
                <input type="password" id="password" name="password" class="form-control" required>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
    <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
</body>

</html>