package com.xx.zhuzq.eurekaclient.controller;

import com.xx.zhuzq.eurekaclient.bean.Admin;
import org.apache.commons.lang.math.NumberUtils;
import org.aspectj.weaver.ast.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author zhuzq
 * @date 2018/8/14 11:52:00
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    private static Logger log = LoggerFactory.getLogger(AdminController.class);

    @Value("${server.port}")
    private String port;

    @RequestMapping("/testEureka")
    @ResponseBody
    public String testEurekaClient(@RequestParam(value = "name", defaultValue = "customer") String name) {
        StringBuilder result = new StringBuilder("hi! ").append(name).append(",i am ").append(port);
        return result.toString();
    }

    /**
     * restful风格接口
     * get
     *
     * @param id
     * @return
     */
    @GetMapping("{id}")
    @ResponseBody
    public String getAdmin(@PathVariable("id") String id) {
        return id;
    }

    @GetMapping("name/{name}")
    @ResponseBody
    public String testAdmin(@PathVariable("name") String name) {
        return name;
    }


    /**
     * restful风格接口
     * post
     * {@link PostMapping}
     * @param admin
     * @return
     */
    @PostMapping
    @ResponseBody
    public String savaAdmin(Admin admin) {
        return admin.toString();
    }

    @PostMapping(value = "test")
    @ResponseBody
    public String addAdmin(Admin admin) {
        return admin.toString() + "|test";
    }

    @PutMapping
    @ResponseBody
    public String modifyAdmin(Admin admin) {
        return admin.toString() + "|put";
    }

    @DeleteMapping("delete")
    @ResponseBody
    public String removeAdmin(String id) {
        return id+"sdfsdg";

    }

    public static void main(String[] args){
//        System.out.println((int) (NumberUtils.toDouble("0.5")*o
        System.out.println(Admin.class.getName());
        TestString();

    }
    public static void test(List<Admin> list){
        System.out.println(list.size());
    }

    public static void TestString(){
        String message = "密码错误%d次，%s分钟内连续错%d次，您的账号将被锁定%d分钟，期间账号将无法登录。%s";
        message = String.format(message,1,2,123,214,"wr");
        System.out.println(message);
    }

    public static void testhttp(){
    }

}
