package com.sunshine.free;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hehe.mapper")
public class FreeApplication {

    public static void main(String[] args) {

        SpringApplication.run(FreeApplication.class, args);
    }

}
