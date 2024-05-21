package com.webtech.webtech.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
    @GetMapping(path = "/")
    public String showHelloWorldPage() {
        return "hello world hi there";
    }
}
