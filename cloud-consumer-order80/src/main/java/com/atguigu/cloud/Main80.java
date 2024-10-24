package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author：丁浩然
 * @Package：com.atguigu.cloud
 * @Project：Default (Template) Project
 * @name：${NAME}
 * @Date：2024/10/20 17:16
 * @Filename：${NAME}
 * @Purpose：null
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main80 {
    public static void main(String[] args) {
        SpringApplication.run(Main80.class);
    }
}