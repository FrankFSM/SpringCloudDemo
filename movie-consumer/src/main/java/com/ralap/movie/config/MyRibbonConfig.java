package com.ralap.movie.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MyRibbonConfig
 *
 * @author: ralap
 * @date: created at 2017/10/25 23:25
 */
//@Configuration
//@ExcudeAnnotatio
public class MyRibbonConfig {

    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }

}
