package com.xx.zhuzq.servicefeign.controller;

import com.xx.zhuzq.servicefeign.remote.EurekaClientAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.StringTokenizer;

/**
 * @author zhuzq
 * @date 2018/8/14 20:01:01
 */
@Controller
public class ZuulTest {
    @Autowired
    private EurekaClientAPI eurekaClientAPI;


    @RequestMapping("/zuul")
    @ResponseBody
    public String testZuul(@RequestParam(value = "name",defaultValue = "feign")String name){

        String remoteResutl = eurekaClientAPI.testEureka(name);
        return remoteResutl;
    }
}
