package com.atguigu.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author：丁浩然
 * @Package：com.atguigu.cloud.config
 * @Project：cloud2024
 * @name：RestTemplateConfig
 * @Date：2024/10/20 17:26
 * @Filename：RestTemplateConfig
 * @Purpose：null
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
