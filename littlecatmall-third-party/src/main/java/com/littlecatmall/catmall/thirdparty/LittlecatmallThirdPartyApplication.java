package com.littlecatmall.catmall.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LittlecatmallThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LittlecatmallThirdPartyApplication.class, args);
    }

}
