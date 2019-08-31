package com.qbl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by home-pc on 2019/8/8.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
public  static void  main(String[] args){

    SpringApplication.run( ConfigServerApplication.class,args);

}

}
