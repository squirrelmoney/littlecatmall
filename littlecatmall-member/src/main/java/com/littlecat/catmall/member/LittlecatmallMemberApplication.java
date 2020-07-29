package com.littlecat.catmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* 1、想要远程调用别的服务：openfeign
* 1）、引入openfeign
* 2）、编写一个接口，告诉springcloud这个接口需要调用远程服务
*       声明接口的每一个方法都是调用哪个服务的哪个请求
* 3）、开启远程调用功能
* */
@EnableFeignClients("com.littlecat.catmall.member.feign")//openfeign
@EnableDiscoveryClient//nacos,只要引入springcloud Alibaba的注册中心依赖，就默认开启改注解
@SpringBootApplication
public class LittlecatmallMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(LittlecatmallMemberApplication.class, args);
    }

}
