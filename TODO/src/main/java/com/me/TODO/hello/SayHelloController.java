package com.me.TODO.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This is a Spring MVC Controller that handles requests for saying hello.
 * The @Controller annotation indicates that this class is a "Controller" (e.g. a web controller).
 */
@Controller
public class SayHelloController {
    
    // /**
    //  * This method is mapped to the "/hello" URL.
    //  * When a GET request is made to "/hello", this method will be executed.
    //  * The @ResponseBody annotation tells Spring MVC to write the returned String directly to the HTTP response body.
    //  * @return A greeting message.
    //  */
    // @RequestMapping("/hello")
    // @ResponseBody
    // public String sayHello() {
    //     return "Hello, World! from SayHelloController";
    // }

    // /**
    //  * This method is mapped to the "/html" URL.
    //  * It returns a complete HTML page as a String.
    //  * The @ResponseBody annotation is used here as well.
    //  * @return An HTML page as a String.
    //  */
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

    /**
     * This method is mapped to the "/hello-jsp" URL.
     * It returns the name of a JSP file ("hello") that should be rendered.
     * Spring MVC's ViewResolver will then look for a file named "hello.jsp" in the configured view directory.
     * @return The name of the JSP view to be rendered.
     */
    @RequestMapping("/hello-jsp")
    public String sayHelloJsp() {
        return "hello";
    }



}
