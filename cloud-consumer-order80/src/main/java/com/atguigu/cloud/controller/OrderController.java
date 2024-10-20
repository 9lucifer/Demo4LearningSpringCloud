package com.atguigu.cloud.controller;

import com.atguigu.cloud.entity.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author：丁浩然
 * @Package：com.atguigu.cloud.controller
 * @Project：cloud2024
 * @name：OrderController
 * @Date：2024/10/20 17:28
 * @Filename：OrderController
 * @Purpose：null
 */
@RestController
public class OrderController {
    public static final String PayMentSrv_Url = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/pay/add")
    public ResultData addOrder(PayDTO payDTO){
       return restTemplate.postForObject(PayMentSrv_Url+"/pay/add",payDTO,ResultData.class);
    }


    @GetMapping("/consumer/pay/get/{id}")
    public ResultData getPayInfo(@PathVariable("id")Integer id){
        return restTemplate.getForObject(PayMentSrv_Url+"/pay/get/"+id,ResultData.class,id);
    }



}
