package com.trpice.userManagement;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    @PostMapping
    public User addUser(){

        User user1 = new User();
        return user1;
    }
}
