package com.atguigu.springboot;

import com.atguigu.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot单元测试
 * 可以在测试期间进行自动注入等容器的功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBoot02ConfigApplicationTests {
    @Autowired
    Person person;
    @Autowired
    ApplicationContext ioc;
    @Test
    void contextLoads() {
        System.out.println(person);
    }
    @Test
    void testHelloService(){
        boolean b=ioc.containsBean("helloService");
        System.out.println(b);
    }


}
