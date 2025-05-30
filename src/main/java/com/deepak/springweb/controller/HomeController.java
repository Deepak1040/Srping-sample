package com.deepak.springweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Hello World!!!";
    }

    @RequestMapping("/about")
    public String about() {
        return "About Page..";
    }

}
