package com.me.TODO.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * This is a Spring MVC Controller for practice purposes.
 * The @Controller annotation indicates that this class is a "Controller" (e.g. a web controller).
 * You can access the practice page with a URL like this:
 * http://localhost:8080/practice?name=yourname&address=yourlocation&height=yourheight
 */
@Controller
public class practiceController {
    
    /**
     * This method handles requests to the /practice endpoint.
     * It takes name, address, and height as request parameters and adds them to the model.
     * Then it returns the "practice" view name. Spring's ViewResolver will look for "practice.jsp".
     * 
     * @param name The name of the person.
     * @param address The address of the person.
     * @param height The height of the person.
     * @param model The ModelMap, used to pass data to the view.
     * @return The name of the practice view.
     */
    @RequestMapping("/practice")
    public String practice(@RequestParam String name, @RequestParam String address, @RequestParam double height,ModelMap model){
        model.addAttribute("name", name);
        model.addAttribute("address", address);
        model.addAttribute("height", height);
        return "practice";
    }


}
