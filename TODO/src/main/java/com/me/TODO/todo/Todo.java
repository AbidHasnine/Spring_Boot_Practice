package com.me.TODO.todo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

/**
 * This class represents a Todo item in the application.
 * It is a simple Plain Old Java Object (POJO) that holds the data for a single todo.
 * This is sometimes referred to as a "model" or "bean".
 */

@Entity
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;

	/**
	 * The description of the todo.
	 * The @Size annotation is a validation constraint from Jakarta Bean Validation.
	 * It ensures that the description is at least 10 characters long.
	 * The message attribute provides a custom error message if the validation fails.
	 */
	@Size(min = 10, message = "Enter atleast 10 characters")
	private String description;
	private LocalDate targetdate;
	private boolean done;

	

	public Todo() {
	}

	/**
	 * Constructor to create a new Todo object.
	 * @param id The unique identifier for the todo.
	 * @param username The username of the user who owns the todo.
	 * @param description The description of the todo task.
	 * @param targetdate The date the todo should be completed by.
	 * @param done A boolean indicating whether the todo is completed.
	 */
	public Todo(int id, String username, String description, LocalDate targetdate, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetdate = targetdate;
		this.done = done;
	}

	// --- Getter and Setter Methods ---
	// These methods are used to access and modify the private fields of the Todo object.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargetdate() {
		return targetdate;
	}

	public void setTargetdate(LocalDate targetdate) {
		this.targetdate = targetdate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	/**
	 * The toString method provides a string representation of the Todo object.
	 * This is useful for debugging and logging.
	 */
	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targetdate="
				+ targetdate + ", done=" + done + "]";
	}

}
