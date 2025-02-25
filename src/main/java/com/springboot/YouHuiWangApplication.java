package com.springboot;

import com.springboot.YouHuiWang.Mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class YouHuiWangApplication {


    public static void main(String[] args) {
        SpringApplication.run(YouHuiWangApplication.class, args);

    }

}
