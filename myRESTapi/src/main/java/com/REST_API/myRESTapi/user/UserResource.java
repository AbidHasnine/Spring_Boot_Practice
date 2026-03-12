package com.REST_API.myRESTapi.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    private UserDaoService service;

    //this is constructor injection
    public UserResource(UserDaoService service){
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> retriveAllUsers (){
        return service.findAll();
    }

    @GetMapping("/userd/{id}")
    public User retriveUser(@PathVariable int id){
        return service.findOne(id);        
    }
}
