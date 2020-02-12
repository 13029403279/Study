package com.atguigu.spring.beans.annotation;

import org.springframework.stereotype.Component;

@Component
public class TestObject {
    public TestObject() {
        System.out.println("TestObject ...");
    }
}
