package com.zab.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zab.user.mapper")
public class ThriftServiceApplication {

    public static void main(String args[]) {
        SpringApplication.run(ThriftServiceApplication.class, args);
    }
}
