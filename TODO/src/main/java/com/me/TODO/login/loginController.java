package com.me.TODO.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * This is a Spring MVC Controller that handles login-related requests.
 * The @Controller annotation indicates that this class is a "Controller" (e.g. a web controller).
 * The @SessionAttributes("name") annotation tells Spring to store the model attribute "name" in the HTTP session.
 * This allows the "name" attribute to be accessible across multiple requests.
 * 
 * The model can show any value in the login.jsp page. You can test it by
 * changing the value of name in the url like this:
 * http://localhost:8080/login?name=John
 * In this case, the login.jsp page will show "Welcome John"
 */
@Controller
@SessionAttributes("name")
public class loginController {

    private AutenticationService autenticationService;
    
    /**
     * This constructor uses Spring's dependency injection to get an instance of AutenticationService.
     * @param autenticationService The authentication service to be injected.
     */
    public loginController(AutenticationService autenticationService) {
        this.autenticationService = autenticationService;
    }

    /**
     * This method handles GET requests to the /login endpoint.
     * It returns the name of the login view, which is "login".
     * Spring's ViewResolver will then look for a file named "login.jsp".
     * @return The name of the login view.
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    /**
     * This method handles POST requests to the /login endpoint.
     * It authenticates the user using the AutenticationService.
     * If authentication is successful, it adds the user's name to the model and returns the "welcome" view.
     * If authentication fails, it adds an error message to the model and returns the "login" view.
     * 
     * @param name The username from the login form.
     * @param password The password from the login form.
     * @param model The ModelMap, which is used to pass data from the controller to the view.
     * @return The name of the view to be rendered.
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String welcome(@RequestParam String name,@RequestParam String password,ModelMap model) {
        
        if(autenticationService.authenticate(name, password)) {
            model.put("name", name);
            //model.put("password", password);
            return "welcome";
        }
        model.put("error", "Invalid username or password");
        return "login";
    }

}
