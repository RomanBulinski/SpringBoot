package com.codecool.rom.SpringBootHelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET )
    @ResponseBody
//    @RequestMapping("/hello")
    // sygnatura metody
    public String hello() {
        // zwracana wartość przez przeglądarkę
        return "<h1>"+HelloMessage.getMessage("WOjtek")+"</h1>";
//        return "<h1>Hello World! :)</h1>";
    }

}






