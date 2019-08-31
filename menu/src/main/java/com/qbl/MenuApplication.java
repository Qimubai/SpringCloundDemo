package com.qbl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by home-pc on 2019/8/8.
 */
@SpringBootApplication
@MapperScan("com.qbl.repository")
public class MenuApplication {

    public static void main(String[] args) {

        SpringApplication.run( MenuApplication.class,args );
    }
}
