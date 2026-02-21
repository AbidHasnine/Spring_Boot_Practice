package com.me.TODO.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

/**
 * This is a Spring MVC Controller for managing Todos.
 * The @Controller annotation indicates that this class is a "Controller".
 * The @SessionAttributes("name") annotation keeps the "name" attribute in the
 * session.
 */
@Controller
@SessionAttributes("name")
public class TodoControllerJpa {


	/**
	 * Constructor for TodoController, with dependency injection of TodoService.
	 * 
	 * @param todoService The service for managing todos.
	 */
	public TodoControllerJpa(TodoService todoService,TodoRepository todoRepository) {
		super();
		this.todoService = todoService;
		this.todoRepository = todoRepository;
	}

	private TodoService todoService;

	private TodoRepository todoRepository;

	/**
	 * Handles requests to "/list-todos".
	 * It retrieves the list of todos for a hardcoded username ("Udemy") and adds
	 * them to the model.
	 * 
	 * @param model The ModelMap for passing data to the view.
	 * @return The name of the view to render ("listTodos").
	 */
	@RequestMapping("/list-todos")
	public String listAllTodos(ModelMap model) {

		String username = getLoginUserName(model);
		List<Todo> todos = todoRepository.findByUsername(username);
		model.addAttribute("todos", todos);

		return "listTodos";
	}

	/**
	 * Handles GET requests to "/add-todo".
	 * This method displays the page for adding a new todo.
	 * It creates a new Todo object and binds it to the form in the "todo.jsp" view.
	 * This is an example of two-way data binding.
	 * 
	 * @param model The ModelMap for passing data to the view.
	 * @return The name of the view to render ("todo").
	 */
	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String showNewTodoPage(ModelMap model) {
		String username = getLoginUserName(model);
		Todo todo = new Todo(0, username, "", LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		return "todo";
	}

	/**
	 * Handles POST requests to "/add-todo".
	 * This method is called when the user submits the form for adding a new todo.
	 * The @Valid annotation triggers the validation of the Todo object.
	 * The BindingResult contains the result of the validation.
	 * If there are validation errors, it returns to the "todo" page to display the
	 * errors.
	 * Otherwise, it adds the new todo using the TodoService and redirects to the
	 * "/list-todos" page.
	 * 
	 * @param model  The ModelMap.
	 * @param todo   The Todo object, with its properties populated from the form
	 *               data.
	 * @param result The result of the validation.
	 * @return A redirect to the list of todos or the name of the "todo" view if
	 *         there are errors.
	 */
	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		// This checks if there are any validation errors in the Todo object. If there
		// are errors, it returns to the "todo" page to display the errors.
		if (result.hasErrors()) {
			return "todo";
		}
		String userName = getLoginUserName(model);
		todoService.addTodo(userName, todo.getDescription(), LocalDate.now().plusYears(1), false);
		return "redirect:/list-todos";
	}

	@RequestMapping("/delete-todo")
	public String deleteTodo(@RequestParam int id) {
		todoService.deleteById(id);
		return "redirect:/list-todos";
	}

	@RequestMapping(value = "/update-todo", method = RequestMethod.GET)
	public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
		Todo todo = todoService.findById(id);
		model.addAttribute("todo", todo);
		return "todo";

	}

	@RequestMapping(value = "/update-todo", method = RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		// This checks if there are any validation errors in the Todo object. If there
		// are errors, it returns to the "todo" page to display the errors.
		if (result.hasErrors()) {
			return "todo";
		}
		String userName = getLoginUserName(model);
		todo.setUsername(userName);
		todoService.updateTodo(todo);
		return "redirect:/list-todos";
	}

	private String getLoginUserName(ModelMap model) {

		org.springframework.security.core.Authentication authentication = SecurityContextHolder.getContext()
				.getAuthentication();

		return authentication.getName();
	}

}
