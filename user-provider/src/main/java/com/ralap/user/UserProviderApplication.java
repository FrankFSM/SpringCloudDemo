package com.ralap.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * UserProviderApplication
 *
 * @author: ralap
 * @date: created at 2017/10/23 20:15
 */
@SpringBootApplication
@EnableEurekaClient
public class UserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication.class, args);
    }
}
