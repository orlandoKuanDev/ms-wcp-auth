package com.example.mswcpauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsWcpAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsWcpAuthApplication.class, args);
    }

}
