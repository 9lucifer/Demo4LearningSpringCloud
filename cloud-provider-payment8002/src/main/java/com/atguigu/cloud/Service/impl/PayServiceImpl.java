package com.atguigu.cloud.Service.impl;

import com.atguigu.cloud.Service.PayService;
import com.atguigu.cloud.entities.Pay;
import com.atguigu.cloud.mapper.PayMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author：丁浩然
 * @Package：com.atguigu.cloud.Service.impl
 * @Project：cloud2024
 * @name：PayServiceImpl
 * @Date：2024/10/20 1:50
 * @Filename：PayServiceImpl
 * @Purpose：null
 */
@Service
public class PayServiceImpl implements PayService {
    @Resource
    private PayMapper payMapper;

    @Override
    public int add(Pay pay) {
        return payMapper.insertSelective(pay);
    }

    @Override
    public int delete(Integer id) {
        return payMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Pay pay) {
        return payMapper.updateByPrimaryKeySelective(pay);
    }

    @Override
    public Pay getById(Integer id) {
        return payMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Pay> getAll() {
        return payMapper.selectAll();
    }
}
