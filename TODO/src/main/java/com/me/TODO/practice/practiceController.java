package com.me.TODO.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class practiceController {
    
    @RequestMapping("/practice")
    public String practice(@RequestParam String name, @RequestParam String address, @RequestParam double height,ModelMap model){
        model.addAttribute("name", name);
        model.addAttribute("address", address);
        model.addAttribute("height", height);
        return "practice";
    }


}
//http://localhost:8080/practice?name=yourname&address=yourlocation&height=yourheight