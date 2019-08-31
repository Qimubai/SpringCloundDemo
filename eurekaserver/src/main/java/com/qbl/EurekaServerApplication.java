package com.qbl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by home-pc on 2019/8/8.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static  void main(String[] args){

        SpringApplication.run( EurekaServerApplication.class,args);
    }



}
