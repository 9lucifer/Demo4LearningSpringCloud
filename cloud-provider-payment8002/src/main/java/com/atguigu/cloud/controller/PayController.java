package com.atguigu.cloud.controller;

import com.atguigu.cloud.Service.PayService;
import com.atguigu.cloud.entities.Pay;
import com.atguigu.cloud.entity.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author：丁浩然
 * @Package：com.atguigu.cloud.controller
 * @Project：cloud2024
 * @name：PayController
 * @Date：2024/10/20 1:54
 * @Filename：PayController
 * @Purpose：null
 */
@RestController
@Slf4j
@Tag(name = "支付微服务模块",description = "支付CRUD")
public class PayController {
    @Resource
    private PayService payService;

    @Operation(summary = "新增",description = "新增支付流水方法")
    @PostMapping("/pay/add")
    public ResultData<String> addPay(@RequestBody Pay pay){
        System.out.println(pay.toString());
        int add = payService.add(pay);
        return ResultData.success("成功插入，返回值："+add);
    }

    @DeleteMapping("/pay/del/{id}")
    @Operation(summary = "删除",description = "删除支付流水方法")
    public ResultData<Integer> deletePay(@PathVariable("id") Integer id){
        return ResultData.success(payService.delete(id));
    }

    @Operation(summary = "更新",description = "更新支付流水方法")
    @PutMapping("/pay/update")
    public ResultData<String> updatePay(@RequestBody PayDTO payDTO){
        Pay pay = new Pay();
        BeanUtils.copyProperties(payDTO,pay);
        int i = payService.update(pay);
        return ResultData.success("成功修改，返回值："+i);
    }

    @Operation(summary = "查询单个",description = "查询单个支付流水方法")
    @GetMapping("/pay/get/{id}")
    public ResultData<Pay> geyById(@PathVariable("id") Integer id){
        return ResultData.success(payService.getById(id));
    }

    @Operation(summary = "查询全部",description = "查询全部支付流水方法")
    @GetMapping("/pay/getAll")
    public ResultData<List> geyAll(){
        return ResultData.success(payService.getAll());
    }

    @Value("${server.port}")
    private String port;

    @GetMapping("/pay/get/info")
    public String getInfoByConsul(@Value("${atguigu.info}") String atguiguInfo){
        return "atguiguInfo:"+atguiguInfo+" port:"+port;
    }
}
