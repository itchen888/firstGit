package com.itcast.easycode.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class easycode {

    @RequestMapping("/hello")
    public String hello(){
//        System.out.println("hello world");
        return "hello world";
    }
}
