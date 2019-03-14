package com.codecool.rom.SpringBootHelloWorld;

import Model.HelloMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET )
    public  String helloForm(){
        return "HelloForm";
    }

//    @ResponseBody
//    @RequestMapping("/hello")
    @RequestMapping(value = "/hello", method = RequestMethod.POST )
    public String hello(HttpServletRequest request, Model model) {
        //get name parameter from request

        String name = request.getParameter("name");
        if(name ==null || name == ""){
            name = "World";
        }

        model.addAttribute("message",HelloMessage.getMessage(name));

        return "Hello";

//        return "Hello/mesage";
//        return "<h1>"+ HelloMessage.getMessage("Jozek")+"</h1>";
//        return "<h1>Hello World! :)</h1>";
    }

}






