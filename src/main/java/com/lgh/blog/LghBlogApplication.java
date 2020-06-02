package com.lgh.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lgh.blog.mapper")
public class LghBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(LghBlogApplication.class, args);
    }

}
