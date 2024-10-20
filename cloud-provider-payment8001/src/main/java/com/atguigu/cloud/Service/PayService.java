package com.atguigu.cloud.Service;

import com.atguigu.cloud.entities.Pay;

import java.util.List;

/**
 * @Author：丁浩然
 * @Package：com.atguigu.cloud.Service
 * @Project：cloud2024
 * @name：PayService
 * @Date：2024/10/20 1:47
 * @Filename：PayService
 * @Purpose：null
 */
public interface PayService {
    public int add(Pay pay);
    public int delete(Integer id);
    public int update(Pay pay);
    public Pay getById(Integer id);
    public List<Pay> getAll();

}
