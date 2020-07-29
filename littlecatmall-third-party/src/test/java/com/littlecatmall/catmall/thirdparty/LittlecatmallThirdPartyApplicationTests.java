package com.littlecatmall.catmall.thirdparty;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class LittlecatmallThirdPartyApplicationTests {
    @Autowired
    private OSSClient ossClient;
    @Test
    void contextLoads() throws FileNotFoundException {

        InputStream inputStream=new FileInputStream("E:\\01cff4597b0d6da8012193a3d9182a.jpg@2o.jpg");
        ossClient.putObject("littlecatmall","test.jpg",inputStream);
        ossClient.shutdown();
        System.out.println("上传完成");
    }

}
