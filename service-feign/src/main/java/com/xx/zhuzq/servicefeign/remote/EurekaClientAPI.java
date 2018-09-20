package com.xx.zhuzq.servicefeign.remote;

import com.xx.zhuzq.servicefeign.remote.impl.EurekaClientAPIHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhuzq
 * @date 2018/8/14 14:43:00
 */
@FeignClient(value = "EUREKA-CLIENT1" ,fallback = EurekaClientAPIHystric.class)
public interface EurekaClientAPI {

    @RequestMapping(value = "/admin/testEureka",method = RequestMethod.GET)
    String testEureka(@RequestParam(value = "name") String name);

}
