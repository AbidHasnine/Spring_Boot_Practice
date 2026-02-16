package com.me.TODO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is the main entry point for the Spring Boot application.
 * The @SpringBootApplication annotation is a convenience annotation that adds all of the following:
 * - @Configuration: Tags the class as a source of bean definitions for the application context.
 * - @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
 * - @ComponentScan: Tells Spring to look for other components, configurations, and services in the com.me.TODO package, allowing it to find and register the controllers.
 */
@SpringBootApplication
public class TodoApplication {

	/**
	 * The main method, which is the entry point for the Java application.
	 * It uses SpringApplication.run() to launch the Spring Boot application.
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

}
