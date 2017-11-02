package com.ralap.feign.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ralap on 2017/10/30.
 */
@Configuration
public class FooConfigration {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
}
