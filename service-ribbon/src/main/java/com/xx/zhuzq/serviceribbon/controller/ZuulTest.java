package com.xx.zhuzq.serviceribbon.controller;

import com.xx.zhuzq.serviceribbon.remote.EurekaClinetAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhuzq
 * @date 2018/8/14 20:03:49
 */
@Controller
public class ZuulTest {
    @Autowired
    private EurekaClinetAPI eurekaClinetAPI;

    @Value("${eureka.clinet.provider}")
    private String eurekaClientURL;

    @RequestMapping("/zuul")
    @ResponseBody
    public String zuulTest(@RequestParam(value = "name",defaultValue = "ribbon")String name){
        StringBuilder url = new StringBuilder(eurekaClientURL).append("/admin/testEureka").append("?name=").append(name);
        String remoteResult = eurekaClinetAPI.test(url.toString());
        return remoteResult;
    }
}
