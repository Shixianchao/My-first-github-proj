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
        System.out.println("你吗，我现在是在分支一上面更改的东西");
        System.out.println("我在分支三上更改的东西，并且更改完成之后提交到分支1上面的");
        System.out.println("第一次commit");
        System.out.println("第二次commit");
        System.out.println("分之一第二次commit");
        System.out.println("分支4上面改的东西");
        System.out.println("分之一上面改东西第一次提交");
        System.out.println("分之一上面改东西第二次提交");
        System.out.println("分之一上面改东西第三次提交");
        System.out.println("分支一三次提交之后的stash操作");
        return "123123123";
    }

}
