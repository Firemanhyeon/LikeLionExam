package org.example.iocexam.controller;

import org.example.iocexam.domain.User;
import org.example.iocexam.service.UserService;
import org.example.iocexam.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }



    public void joinUser(){
        //실제 동작할 때는 사용자로 부터 정보를 받아온다.

        //여기서는 그냥 정보를 써준다.
        User user = new User();
        user.setEmail("admin@gmail.com");
        user.setPassword("123456");
        user.setName("admin");
        userService.joinUser(user);
    }
}
