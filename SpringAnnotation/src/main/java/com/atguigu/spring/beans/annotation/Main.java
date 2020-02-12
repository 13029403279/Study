package com.atguigu.spring.beans.annotation;

import com.atguigu.spring.beans.annotation.controller.UserController;
import com.atguigu.spring.beans.annotation.respository.UserRespository;
import com.atguigu.spring.beans.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext ctx=new
                ClassPathXmlApplicationContext("beans-annotation.xml");
        TestObject to=(TestObject) ctx.getBean("testObject");

        UserRespository userRespository=(UserRespository)ctx.getBean("userRepository");
        userRespository.save();

        UserService userService=(UserService)ctx.getBean("userService");
        userService.add();

        UserController userController=(UserController)ctx.getBean("userController");
        userController.execute();
    }
}
