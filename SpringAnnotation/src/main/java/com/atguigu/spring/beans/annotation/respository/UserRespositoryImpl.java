package com.atguigu.spring.beans.annotation.respository;

import org.springframework.stereotype.Repository;

@Repository("userRepository")
public class UserRespositoryImpl implements UserRespository {
    @Override
    public void save() {
        System.out.println("UserRespository Save...");
    }
}
