package com.nami.ojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Nami
 */
@SpringBootApplication()
@MapperScan("com.nami.ojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.nami")
@EnableDiscoveryClient
@EnableFeignClients(basePackages ={"com.nami.ojbackendserviceclient.service"})
public class NamiojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NamiojBackendUserServiceApplication.class, args);
    }

}
