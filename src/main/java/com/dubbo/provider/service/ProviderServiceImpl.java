package com.dubbo.provider.service;

/**
 * Created by sxt on 2020-06-03 16:32
 */

/**
 * xml方式服务提供者实现类
 */
import com.dubbo.provider.service.ProviderService;
public class ProviderServiceImpl implements ProviderService {
    public String SayHello(String word) {
        return word;
    }
}