package com.codecool.rom.SpringBootHelloWorld;

import Model.HelloMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloWorldController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET )
    @ResponseBody
//    @RequestMapping("/hello")
    // sygnatura metody
    public String hello(HttpServletRequest request) {

        //get name parameter from request
        String name = request.getParameter("name");
        if(name ==null){
            name = "World";
        }

        return "<h1>"+ HelloMessage.getMessage(name)+"</h1>";
//        return "<h1>"+ HelloMessage.getMessage("Jozek")+"</h1>";
//        return "<h1>Hello World! :)</h1>";
    }

}






