package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注要给主程序类，说明这是一个Spring boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public  static void main(String[] args){

        // Spring 应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
