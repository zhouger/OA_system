package com.example.server.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//测试
@RestController
public class HellowController {

    @GetMapping("hello")
    public String hellow()
    {
        return "hellow";
    }

    @GetMapping("/employee/basic/hello")
    public String hello2()
    {
        return "/employee/basic/hello";
    }

    @GetMapping("/employee/advanced/hello")
    public String hello3()
    {
        return "/employee/advanced/hello";
    }


}
