package com.test_web_service.test_web_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class Controller {


    @GetMapping
    public String testMethod() {
        return "Hello World";
    }
}
