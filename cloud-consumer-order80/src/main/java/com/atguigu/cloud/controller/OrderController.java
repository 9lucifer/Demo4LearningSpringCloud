package com.atguigu.cloud.controller;

import com.atguigu.cloud.entity.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import jakarta.annotation.Resource;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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
//    public static final String PayMentSrv_Url = "http://localhost:8001";
    public static final String PayMentSrv_Url = "http://cloud-payment-service";

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

    @GetMapping(value = "/consumer/pay/get/info")
    private String getInfoByConsul()
    {
        return restTemplate.getForObject(PayMentSrv_Url + "/pay/get/info", String.class);
    }

    @Resource
    private DiscoveryClient discoveryClient;
    @GetMapping("/consumer/discovery")
    public String discovery()
    {
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            System.out.println(element);
        }

        System.out.println("===================================");

        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment-service");
        for (ServiceInstance element : instances) {
            System.out.println(element.getServiceId()+"\t"+element.getHost()+"\t"+element.getPort()+"\t"+element.getUri());
        }

        return instances.get(0).getServiceId()+":"+instances.get(0).getPort();
    }

}
