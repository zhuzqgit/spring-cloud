package com.xx.zhuzq.serviceribbon.remote.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.xx.zhuzq.serviceribbon.remote.EurekaClinetAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhuzq
 * @date 2018/8/14 15:18:06
 */
@Service
public class EurekaClientAPIImpl implements EurekaClinetAPI {
    private static Logger log = LoggerFactory.getLogger(EurekaClientAPIImpl.class);

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "EurekaClientHystrix")
    public String test(String url) {
        String result = restTemplate.getForObject(url,String.class);
        log.error("result:{}",result);
        return result;
    }

    public String EurekaClientHystrix(String str){
        return "sorry ,please wait a momnet!";
    }
}
