package com.xx.zhuzq.serviceribbon.controller;

import com.xx.zhuzq.serviceribbon.remote.EurekaClinetAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhuzq
 * @date 2018/8/14 13:49:19
 */
@Controller
@RequestMapping("/ribbon")
public class ServiceRibbonTest {
    private static Logger log = LoggerFactory.getLogger(ServiceRibbonTest.class);

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private EurekaClinetAPI eurekaClinetAPI;

    @Value("${eureka.clinet.provider}")
    private String eurekaClientURL;

    @RequestMapping("/testRibbon")
    @ResponseBody
    public String testRibbon(@RequestParam(value = "name",defaultValue = "ribbon")String name){
        StringBuilder url = new StringBuilder(eurekaClientURL).append("/admin/testEureka").append("?name=").append(name);
        String remoteResult = eurekaClinetAPI.test(url.toString());
        return remoteResult;
    }
}
