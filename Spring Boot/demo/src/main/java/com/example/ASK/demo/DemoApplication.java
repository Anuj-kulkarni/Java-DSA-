package com.example.ASK.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(DemoApplication.class, args);

        Course course = context.getBean(Course.class);
        System.out.println("Course: " + course.getCourseName());
    }

    @Bean
    public Course course() {
        return new Course("Java");
    }
}