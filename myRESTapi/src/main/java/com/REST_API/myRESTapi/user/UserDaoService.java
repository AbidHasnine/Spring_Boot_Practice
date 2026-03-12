package com.REST_API.myRESTapi.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    // DAO is used for implement methods to retrive data

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "John Doe", LocalDate.now().minusYears(30)));
        users.add(new User(2, "Kevin 2Phones", LocalDate.now().minusYears(20)));
        users.add(new User(3, "Pink Guy", LocalDate.now().minusYears(35)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        return users.stream().filter(predicate).findFirst().get();
    }

}
