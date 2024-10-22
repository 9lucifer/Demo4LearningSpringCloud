package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author：丁浩然
 * @Package：com.atguigu.cloud
 * @Project：Default (Template) Project
 * @name：${NAME}
 * @Date：2024/10/22 19:54
 * @Filename：${NAME}
 * @Purpose：null
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class MainOpenFegin80 {
    public static void main(String[] args) {
        SpringApplication.run(MainOpenFegin80.class,args);
    }
}