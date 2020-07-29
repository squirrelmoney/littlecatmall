package com.littlecat.catmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* 1、整合mybatisplus
*      （1）导入依赖
*        <!--mybatis-plus -->
            <dependency>
                <groupId>com.baomidou</groupId>
                <artifactId>mybatis-plus-boot-starter</artifactId>
                <version>3.3.2</version>
            </dependency>
*       （2）配置
*              1、配置数据源
*                   （1）导入数据库驱动
*                   （2）在yml中配置数据源
*               2、配置mybatisplus
*                   （1）使用mapperscan
*                    (2)配置sql映射文件位置
* 2、逻辑删除
*   1）、配置全局逻辑删除规则（可忽略）
*   2）配置逻辑删除组件（3.1.1以下才配置）
*   3）实体类字段上加上逻辑删除注解@TableLogic
*           @TableLogic
*            private Integer deleted;
* 3、JSR303
*      1）给Bean添加校验注解:javax.validation.constraints，并定义自己的message提示
*      2)开启校验功能：在调用方法体中使用@valid
*        效果：校验错误以后会有默认的响应
*      3)给校验的方法体的bean后紧跟一个BindingResult，就可以获取到校验的结果
*      4)分组校验（多场景复杂校验）
*           (1)@NotBlank(message = "品牌名不能为空",groups = {AddGroup.class,UpdateGroup.class})
*               给校验注解标注什么情况需要进行校验
*           (2)、@Validated(UpdateGroup.class)
*           (3)默认没有指定分组的校验注解，在分组校验下@Validated(UpdateGroup.class)不生效，只会在@Validated生效
*       5)自定义校验
*           (1)编写一个自定义校验注解
*           (2)编写一个自定义校验器
*           (3)关联自定义校验注解和自定义校验器
*               @Documented
                @Constraint(validatedBy = { ListConstraintValidator.class }[可以指定多个不同的校验器，适配不同类型的校验])
                @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
                @Retention(RUNTIME)
                public @interface ListValue {
* 4、统一的异常处理
*   @ContollerAdvice
* */
@MapperScan("com.littlecat.catmall.product.dao")
@SpringBootApplication
public class LittlrcatmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(LittlrcatmallProductApplication.class, args);
    }

}
