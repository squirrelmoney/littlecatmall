package com.littlecat.catmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 1、如何使用nacos作为配置中心统一管理配置
 * 1）、引入依赖
 *         <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 * 2）、创建一个bootstrap.properties
 *      #优先于application.properties加载
 *      spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *      spring.application.name=littlecatmall-coupon、
 *   3）需要给配置中心默认添加一个叫数据集（data Id）littlecatmall-coupon.properties（${prefix}-${spring.profile.active}.${file-extension}）
 *      默认规则：应用名.properties
 *   4)给应用名.properties添加任何配置
 *   5）动态获取配置
 *      @RefreshScope //刷新配置
 *      @Value("${coupons.username}")
 *      优先使用配置中心的配置
 *
 * 2、细节
 *      1）命名空间：配置隔离
 *      默认：public（保留空间）；默认新增的配置文件都在public空间
 *          1、开发环境、测试环境、生产环境：可以利用不同的命名空间进行隔离
 *              注意：在bootstrap.properties中需要配置指定的命名id
 *              spring.cloud.nacos.config.namespace=6da96a1f-24ef-42b4-b834-a26e0411f748
 *          2、每一个微服务之间互相隔离，每一个微服务都创建自己的命名空间，只加载自己的命名空间
 *       2）配置集：所有配置集合
 *       3）配置集ID：类似文件名
 *       Data Id
 *       4）配置分组：
 *       默认所有配置集都属于：DEFAULT_GROUP
 *       例如双11时，使用Group为1111的组的配置
 *       spring.cloud.nacos.config.group=1111
 *
 *       每个微服务创建自己的命名空间，再使用配置分组区分环境：dev、test、prop
 * 3、同时加载多个配置集
 *  1)、微服务任何配置信息，任何配置文件都可以放在配置中心
 *  2）、只需要在bootstrap.properties说明加载配置中心哪些配置文件即可
 *  3）、@value,@ConfigurationProperties...
 *  以前springboot任何从配置文件中获值的方式，都能使用配置中心的配置文件
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LittlecatmallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(LittlecatmallCouponApplication.class, args);
    }

}
