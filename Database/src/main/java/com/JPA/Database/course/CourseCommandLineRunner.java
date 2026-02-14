package com.JPA.Database.course;

import com.JPA.Database.course.jdbc.course.Course;
import com.JPA.Database.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//If u want to fire up some code at the start of the app Use CommandLineRunner
@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
            repository.save(new Course(1,"Learn LLVM","Coursera"));
            repository.save(new Course(2,"Learn Chemistry","Udemy"));
            repository.save(new Course(3,"Learn Math","BUET"));

            repository.deleteById(1l);

            System.out.println(repository.findById(2l));
            System.out.println(repository.findById(3l));

            System.out.println(repository.findAll());
            System.out.println(repository.count());
            System.out.println(repository.findByAuthor("Udemy"));
            System.out.println(repository.findByName("Learn Math"));
    }
}
