package com.codecool.rom.SpringBootHelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    // sygnatura metody
    public String hello() {
        // zwracana wartość przez przeglądarkę
        return "Hello World! :)";
    }


}






