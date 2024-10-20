package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author：丁浩然
 * @Package：com.atguigu.cloud
 * @Project：Default (Template) Project
 * @name：${NAME}
 * @Date：2024/10/20 1:32
 * @Filename：${NAME}
 * @Purpose：null
 */
@SpringBootApplication
@MapperScan("com.atguigu.cloud.mapper") //import tk.mybatis.spring.annotation.MapperScan;
public class Main8001 {
    public static void main(String[] args) {
        SpringApplication.run(Main8001.class,args);
    }
}