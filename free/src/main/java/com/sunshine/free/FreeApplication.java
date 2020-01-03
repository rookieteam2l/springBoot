package com.sunshine.free;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author fq
 * @date 2019-06-21
 */

@SpringBootApplication
@MapperScan("com.sunshine.free.dao")
@ComponentScan("com.sunshine")
public class FreeApplication {

    public static void main(String[] args) {

        SpringApplication.run(FreeApplication.class, args);
    }

}
