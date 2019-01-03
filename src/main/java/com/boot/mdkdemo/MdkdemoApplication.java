package com.boot.mdkdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.boot.mdkdemo.entity","com.boot.mdkdemo.controller","com.boot.mdkdemo.service","com.boot.mdkdemo.service.impl"})
@MapperScan({"com.boot.mdkdemo.dao"})
@tk.mybatis.spring.annotation.MapperScan("com.boot.mdkdemo.mapper")
public class MdkdemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(MdkdemoApplication.class, args);
    }

}

