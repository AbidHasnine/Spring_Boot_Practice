package com.JPA.Database.course.jdbc;

import com.JPA.Database.course.jdbc.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//If u want to fire up some code at the start of the app Use CommandLineRunner
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
            repository.insert(new Course(1,"Learn AWS","Coursera"));
            repository.insert(new Course(2,"Learn LLM","Coursera"));
            repository.insert(new Course(3,"Learn Math","Coursera"));

            repository.deleteById(1);
    }
}
