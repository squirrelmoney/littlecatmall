package com.littlecat.catmall.product;

import com.littlecat.catmall.product.entity.BrandEntity;
import com.littlecat.catmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
class LittlrcatmallProductApplicationTests {

    @Resource
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setDescript("bb");
        brandEntity.setName("aa");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
