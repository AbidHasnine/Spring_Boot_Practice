package com.me.TODO.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * This is a Spring Service component that provides services for managing Todos.
 * The @Service annotation indicates that this class is a "Service".
 * In this application, it manages a static list of todos, acting as an in-memory database.
 */
@Service
public class TodoService {
	// A static list to hold the todos. In a real application, this would be replaced by a database.
	private static List<Todo> todos = new ArrayList<>();
	// A counter to generate unique IDs for new todos.
	private static int todosCount = 0;

	/**
	 * A static initializer block to populate the list of todos with some initial data.
	 * This block is executed only once when the class is first loaded by the JVM.
	 */
	static {
		todos.add(new Todo(todosCount++,
				"Udemy",
				"Learn LLM",
				LocalDate.now().plusYears(1),
				false));
		todos.add(new Todo(todosCount++,
				"Udemy",
				"Learn OpSec",
				LocalDate.now().plusYears(2),
				false));
		todos.add(new Todo(todosCount++,
				"Udemy",
				"Learn Deep learning",
				LocalDate.now().plusYears(5),
				false));
	}

	/**
	 * Finds all todos for a given username.
	 * In this implementation, it returns the entire list of todos, as there is no user-specific logic.
	 * @param username The username to find todos for.
	 * @return A list of todos.
	 */
	public List<Todo> findByUsername(String username) {
		return todos;
	}

	/**
	 * Adds a new todo to the list.
	 * @param username The username of the user adding the todo.
	 * @param description The description of the todo.
	 * @param targetDate The target date for the todo.
	 * @param isDone Whether the todo is done or not.
	 */
	public void addTodo(String username, String description, LocalDate targetDate, boolean isDone) {
		Todo todo = new Todo(todosCount++, username, description, targetDate, isDone);
		todos.add(todo);

	}

}
