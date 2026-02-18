<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">
    <div>Add a Todo to the List</div>

    <%--
        The form:form tag creates an HTML form.
        The modelAttribute="todo" attribute binds this form to the "todo" object in the model.
        This enables two-way data binding.
        The action="add-todo" attribute specifies that the form should be submitted to the "/add-todo" URL via a POST request.
    --%>
    <form:form modelAttribute="todo" action="add-todo" method="post">
        <div class="mb-3">
            <label for="description" class="form-label">Description</label>
            <%--
                The form:input tag creates an HTML input field.
                The path="description" attribute binds this input to the 'description' property of the 'todo' model attribute.
            --%>
            <form:input path="description" type="text" id="description" class="form-control"
                required="true" />
        </div>
        <div class="mb-3">
            <label for="targetdate" class="form-label">Target Date</label>
            <%--
                This input field is bound to the 'targetdate' property of the 'todo' model attribute.
            --%>
            <form:input path="targetdate" type="date" id="targetdate" class="form-control"
                required="true" />
        </div>
        <%--
            The form:errors tag displays validation errors for a specific field.
            If the 'description' field has any validation errors (e.g., it's too short), the error message will be displayed here.
            The cssClass attribute applies a CSS class to the error message.
        --%>
        <form:errors path="description" cssClass="text-warning"/>
        <%--
            These are hidden input fields used to submit values that are not directly entered by the user.
        --%>
        <form:input path="done" type="hidden" value="false" />
        <form:input path="id" type="hidden" value="0" />
        <button type="submit" class="btn btn-success">Add Todo</button>
    </form:form>
</div>

<%@ include file="common/footer.jspf" %>
