package com.exercise.todolist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpringBootHelloWorld {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello World";
    }
}
