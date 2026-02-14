package com.JPA.Database.course.springdatajpa;

import com.JPA.Database.course.jdbc.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {

    //Custom query method
    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);
}
