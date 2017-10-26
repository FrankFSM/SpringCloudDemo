package com.ralap.movie;


import com.ralap.movie.config.ExcudeAnnotatio;
import com.ralap.movie.config.MyRibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "user-provider", configuration = MyRibbonConfig.class)
//@ComponentScan(excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {ExcudeAnnotatio.class})})
public class MovieConsumerApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        RestTemplate template = new RestTemplate();
        return template;
    }

    public static void main(String[] args) {
        SpringApplication.run(MovieConsumerApplication.class, args);
    }
}
