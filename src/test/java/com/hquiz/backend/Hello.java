package com.hquiz.backend;

import org.springframework.web.bind.annotation.GetMapping;

public class Hello {
   @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
}
