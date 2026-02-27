package com.REST_API.myRESTapi.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    //DAO is used for implement methods to retrive data 

    private static List<User> users = new ArrayList<>();

    static{
        users.add(new User(1,"John Doe",LocalDate.now().minusYears(30)));
        users.add(new User(2,"Kevin 2Phones",LocalDate.now().minusYears(20)));
        users.add(new User(3,"Pink Guy",LocalDate.now().minusYears(35)));
    }

}
