package com.xx.zhuzq.servicefeign.controller;

import com.xx.zhuzq.servicefeign.remote.EurekaClientAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhuzq
 * @date 2018/8/14 14:53:30
 */
@Controller
@RequestMapping("/feign")
public class FeignTest {
    private static Logger log = LoggerFactory.getLogger(FeignTest.class);


    @Autowired
    private EurekaClientAPI eurekaClientAPI;

    @RequestMapping("/testFeign")
    @ResponseBody
    public String testFeign(@RequestParam(value = "name" ,defaultValue = "feign") String name){
        String result  = eurekaClientAPI.testEureka(name);
        log.error("result:{}",result);
        return result;
    }

}
