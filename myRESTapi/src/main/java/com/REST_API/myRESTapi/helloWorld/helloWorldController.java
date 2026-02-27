package com.REST_API.myRESTapi.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {
    

    // @RequestMapping(method = RequestMethod.GET , path = "/hello-world")
    // public String helloWorld(){

    //     return "hello-world from REST_API";
    // }

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "hello-world from REST_API and @GETMapping";
    }

    @GetMapping("/hello-world-bean")
    public com.REST_API.myRESTapi.helloWorld.helloWorldBean helloWorldBean(){
        return new helloWorldBean("Hello World");
    }

    @GetMapping("/hello-world/path-variable/{name}")
    public helloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new helloWorldBean(String.format("Hello World %s", name));
    }

}
