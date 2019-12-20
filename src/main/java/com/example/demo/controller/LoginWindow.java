package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by D.Z.B.
 * Time: 2016/12/16 15:45
 */
@RestController
public class LoginWindow {

    @RequestMapping("/login")
    public String login(){
        return "it's a LoginWindow";
    }
}
