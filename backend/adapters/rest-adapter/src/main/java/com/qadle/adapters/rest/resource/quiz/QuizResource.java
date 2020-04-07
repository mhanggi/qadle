package com.qadle.adapters.rest.resource.quiz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = "application/json")
public class QuizResource {

    @GetMapping("/quiz")
    public String helloWorld() {
        return "Hello, World";
    }

}
