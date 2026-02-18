<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">
    <div>Welcome to Todo List</div>
    <table class="table">

        <thead>
            <tr>
                <th>id</th>
                <th>description</th>
                <th>Target date</th>
                <th>is done?</th>
                <th></th>
                <th></th>
            </tr>
        </thead>

        <tbody>
            <%-- The c:forEach tag iterates over the 'todos' collection, which was passed from the
                controller. For each 'todo' in the 'todos' list, a new table row is created. The 'var'
                attribute specifies the name of the variable for the current item. --%>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <%-- The Expression Language (EL) syntax ${...} is used to access the properties
                            of the 'todo' object. For example, ${todo.id} calls the getId() method on
                            the current Todo object. --%>
                            <td>${todo.id}</td>
                            <td>${todo.description}</td>
                            <td>${todo.targetdate}</td>
                            <td>${todo.done}</td>
                            <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a>
                            </td>
                            <td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a>
                            </td>
                    </tr>
                </c:forEach>
        </tbody>
    </table>
    <%-- This is a link to the 'add-todo' page, styled as a Bootstrap button. --%>
        <a href="add-todo" class="btn btn-primary">Add Todo</a>
</div>

<%@ include file="common/footer.jspf" %>
