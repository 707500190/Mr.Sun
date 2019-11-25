package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Configuration
public class testA {





    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/test-spring.xml");
       // User user = context.getBean(User.class);
       // System.out.println(user.getId());
    }


}
