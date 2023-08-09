package com.cccs7.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p> Eureka 启动类 </p>
 *
 * @Author cccs7/cs7eric - csq020611@gmail.com
 * @Description Eureka 启动类
 * @Date 2023/8/9 16:12
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
