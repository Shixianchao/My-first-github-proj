package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/hehe")
    @ResponseBody
    public String hehe(){
        System.out.println("woca");
        System.out.println("我已经改了一个东西");
        System.out.println("我已经改了第二个东西");
        System.out.println("我已经改了第三个东西");
        return "123123123";
    }

}
