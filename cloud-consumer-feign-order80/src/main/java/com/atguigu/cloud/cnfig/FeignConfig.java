package com.atguigu.cloud.cnfig;
import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.util.retry.Retry;

/**
 * @Author：丁浩然
 * @Package：com.atguigu.cloud.cnfig
 * @Project：cloud2024
 * @name：feign
 * @Date：2024/10/22 23:27
 * @Filename：feign
 * @Purpose：null
 */
@Configuration
public class FeignConfig {

    @Bean
    public Retryer myRetyer(){
        return new Retryer.Default(100,1,3);
    }

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

}
