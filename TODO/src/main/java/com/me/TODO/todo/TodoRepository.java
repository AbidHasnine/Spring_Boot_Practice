package com.me.TODO.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//<Bean,id field wrapper>
public interface TodoRepository extends JpaRepository<Todo ,Integer> {
    public List<Todo> findByUsername(String username);
}
