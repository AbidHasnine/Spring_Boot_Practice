<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6 text-center">
            <div class="welcome-container">
                <h1>Welcome! ${name}</h1>
                <p>Hello! Thanks for visiting our application. Get started by managing your todos.</p>
                <%--
                    This displays the 'name' attribute from the model.
                    The value of 'name' is set in the loginController after successful authentication.
                --%>
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

<%@ include file="common/footer.jspf" %>
