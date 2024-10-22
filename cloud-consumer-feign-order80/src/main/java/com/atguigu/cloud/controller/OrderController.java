package com.atguigu.cloud.controller;

import com.atguigu.cloud.apis.PayFeignApi;
import com.atguigu.cloud.entity.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

/**
 * @Author：丁浩然
 * @Package：com.atguigu.cloud.controller
 * @Project：cloud2024
 * @name：OrderController
 * @Date：2024/10/22 21:23
 * @Filename：OrderController
 * @Purpose：null
 */
@RestController
public class OrderController {

    @Resource
    private PayFeignApi payFeignApi;

    @PostMapping("/feign/pay/add")
    public ResultData addOrder(@RequestBody PayDTO payDTO){
        ResultData resultData = payFeignApi.addPay(payDTO);
        return resultData;
    }

    @GetMapping("/feign/pay/get/{id}")
    public ResultData getPayInfo(@PathVariable("id") Integer id){
        ResultData resultData = payFeignApi.getPayInfo(id);
        return resultData;
    }

    @GetMapping("/feign/pay/mylb")
    public String mylb(){
        String res = payFeignApi.mylb();
        return res;
    }
}
