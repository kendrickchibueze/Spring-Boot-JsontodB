package com.cck.springbootjsontodb.controller;


import com.cck.springbootjsontodb.domain.User;
import com.cck.springbootjsontodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/list")
    public Iterable<User> list(){
        return userService.list();
    }
}
