package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stu")
public class hello {
   @GetMapping("/hello")
    public String hello(String id){
       return "hello"+id;
   }
}
