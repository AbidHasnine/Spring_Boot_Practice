package com.me.TODO.login;

import org.springframework.stereotype.Service;

/**
 * This is a Spring Service component that provides authentication services.
 * The @Service annotation indicates that this class is a "Service" - a component that contains business logic.
 */
@Service
public class AutenticationService {
    
    /**
     * Authenticates a user based on their username and password.
     * In a real application, this method would typically check the credentials against a database or another authentication provider.
     * For this demo, it uses hardcoded values.
     * 
     * @param name The username of the user to authenticate.
     * @param password The password of the user to authenticate.
     * @return true if the credentials are valid, false otherwise.
     */
    public boolean authenticate(String name, String password) {
        // In a real application, you would check the username and password against a database or other data source
        // For this example, we will just check if the username is "admin" and the password is "password"
        
        boolean isValidUsername = name.equalsIgnoreCase("admin");
        boolean isValidPassword = password.equalsIgnoreCase("password");

        return isValidUsername && isValidPassword;
    }
}
