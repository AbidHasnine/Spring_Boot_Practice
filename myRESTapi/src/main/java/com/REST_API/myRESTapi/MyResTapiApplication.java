package com.REST_API.myRESTapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyResTapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyResTapiApplication.class, args);
	}

	@Bean
    CommandLineRunner run() {
        return args -> {
            System.out.println("====================================");
            System.out.println("My REST API is Ready!");
            System.out.println("Running on: http://localhost:8080");
            System.out.println("====================================");
        };
    }

}
