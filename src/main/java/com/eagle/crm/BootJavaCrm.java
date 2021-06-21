package com.eagle.crm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;


@MapperScan("com.eagle.crm.mapper")
@ServletComponentScan(basePackages = "com")
@SpringBootApplication()
public class BootJavaCrm {
//    exclude = RedisAutoConfiguration.class
    public static void main(String[] args) {
        SpringApplication.run(BootJavaCrm.class, args);
    }


}