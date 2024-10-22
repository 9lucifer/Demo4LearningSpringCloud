package com.atguigu.cloud.apis;

import com.atguigu.cloud.entity.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author：丁浩然
 * @Package：com.atguigu.cloud.apis
 * @Project：cloud2024
 * @name：PayFeignApi
 * @Date：2024/10/22 20:00
 * @Filename：PayFeignApi
 * @Purpose：null
 */
@FeignClient(value = "cloud-payment-service")
public interface PayFeignApi {
    @PostMapping(value = "/pay/add")
    public ResultData addPay(@RequestBody PayDTO payDTO);

    @GetMapping("/pay/get/{id}")
    public ResultData getPayInfo(@PathVariable("id")Integer id);

    @GetMapping("/pay/get/info")
    public String  mylb();
}
