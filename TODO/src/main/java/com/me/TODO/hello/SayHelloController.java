package com.me.TODO.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SayHelloController {
    
    // @RequestMapping("/hello")
    // @ResponseBody
    // public String sayHello() {
    //     return "Hello, World! from SayHelloController";
    // }

    // @RequestMapping("/html")
    // @ResponseBody
    // public String sayHtml () {

    //     StringBuffer sb = new StringBuffer();
    //     sb.append("<html>");
    //     sb.append("<head><title>HTML Response</title></head>");
    //     sb.append("<body><h1>Hello, World! from HTML </h1></body>");
    //     sb.append("</html>");

    //     return sb.toString();
    // } 

    //JSP

    @RequestMapping("/hello-jsp")
    public String sayHelloJsp() {
        return "hello";
    }



}
  