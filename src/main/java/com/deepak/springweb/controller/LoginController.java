package com.deepak.springweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")

public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "Login Page...";
    }

}
