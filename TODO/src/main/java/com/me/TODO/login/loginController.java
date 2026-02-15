package com.me.TODO.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class loginController {

    private AutenticationService autenticationService;
    

    public loginController(AutenticationService autenticationService) {
        this.autenticationService = autenticationService;
    }




    // This method will handle GET requests to the /login endpoint and return the login view
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login() {
        return "login";
    }

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
// this model can show any value in the login.jsp page, you can test it by
// changing the value of name in the url like this:
// http://localhost:8080/login?name=John
// In this case, the login.jsp page will show "Welcome John"