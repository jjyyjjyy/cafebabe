package com.example.circular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author jy
 */
@SpringBootApplication
public class CircularBeanDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CircularBeanDemoApplication.class, args);
        System.out.println(context.getBean(CircularBeanA.class).getCircularBeanB());
    }
}
