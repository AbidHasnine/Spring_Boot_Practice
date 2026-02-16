<%-- 
    This is a JSP (JavaServer Pages) file.
    It's a technology that helps software developers create dynamically generated web pages based on HTML, XML, or other document types.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- 
    The taglib directive declares that this page uses a custom tag library, in this case, the JSTL core library.
    This allows us to use tags like <c:if>, <c:forEach>, etc.
--%>

	<html>

	<head>
		<%--
            This links to the Bootstrap CSS file using WebJars.
            WebJars are client-side web libraries (e.g. jQuery & Bootstrap) packaged into JAR (Java Archive) files.
        --%>
		<link rel="stylesheet" href="webjars/bootstrap/5.3.3/css/bootstrap.min.css">
		<title>Document</title>
	</head>

	<body>
		<div class="container">
			<h1>
				I Like Spring Boot you JSP!
			</h1>
		</div>
        <%--
            These script tags include jQuery and Bootstrap's JavaScript for interactive components.
        --%>
		<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
	</body>

	</html>