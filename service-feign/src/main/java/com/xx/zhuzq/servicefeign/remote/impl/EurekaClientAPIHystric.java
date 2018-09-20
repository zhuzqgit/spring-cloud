package com.xx.zhuzq.servicefeign.remote.impl;

import com.xx.zhuzq.servicefeign.remote.EurekaClientAPI;
import org.springframework.stereotype.Component;

/**
 * @author zhuzq
 * @date 2018/8/14 15:47:24
 */
@Component
public class EurekaClientAPIHystric implements EurekaClientAPI {

    @Override
    public String testEureka(String name) {
        return "sorry!"+name;
    }
}
