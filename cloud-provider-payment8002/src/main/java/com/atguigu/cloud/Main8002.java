package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author：丁浩然
 * @Package：com.atguigu.cloud
 * @Project：Default (Template) Project
 * @name：${NAME}
 * @Date：2024/10/22 16:30
 * @Filename：${NAME}
 * @Purpose：null
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.atguigu.cloud.mapper") //import tk.mybatis.spring.annotation.MapperScan;
@RefreshScope
public class Main8002 {
    public static void main(String[] args) {
        SpringApplication.run(Main8002.class,args);
    }
}