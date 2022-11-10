package com.java.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld
{

    @RequestMapping("/")
    public String hello()
    {
        return "Hello World";
    }
}
    
