package com.xxzhuzq.eurekaservver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServverApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EurekaServverApplication.class, args);

    }
}
