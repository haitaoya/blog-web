package com.iain.springdemo.service.impl;

import com.iain.springdemo.domain.UserInfo;
import com.iain.springdemo.mapper.UserMapper;
import com.iain.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2020/9/2 12:26 上午
 * @Created by wht
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserInfo> findByMap(Map<String, Object> args) {
        return userMapper.findByMap(args);
    }

    @Override
    public List<UserInfo> findAll() {
        return userMapper.findAll();
    }
}
