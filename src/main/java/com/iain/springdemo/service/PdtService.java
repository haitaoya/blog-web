package com.iain.springdemo.service;

import com.iain.springdemo.domain.PdtInfo;

import java.util.List;

/**
 * @Classname pdtService
 * @Description TODO
 * @Date 2020/8/26 1:13 下午
 * @Created by wht
 */
public interface PdtService {
    List<PdtInfo> findAll();
}
