package com.me.TODO.login;

import org.springframework.stereotype.Service;

@Service
public class AutenticationService {
    public boolean authenticate(String name, String password) {
        // In a real application, you would check the username and password against a database or other data source
        // For this example, we will just check if the username is "admin" and the password is "password"
        
        boolean isValidUsername = name.equalsIgnoreCase("admin");
        boolean isValidPassword = password.equalsIgnoreCase("password");

        return isValidUsername && isValidPassword;
    }
}
