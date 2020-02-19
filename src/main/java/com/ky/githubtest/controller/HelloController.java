package com.ky.githubtest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("info")
    public String info(){
        return "Hello SpringBoot";
    }

    //开发人员写的一句话
}
