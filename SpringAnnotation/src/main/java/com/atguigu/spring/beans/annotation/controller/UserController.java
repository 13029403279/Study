package com.atguigu.spring.beans.annotation.controller;

import com.atguigu.spring.beans.annotation.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    public void execute(){
        System.out.println("UserController execute...");
    }
}
