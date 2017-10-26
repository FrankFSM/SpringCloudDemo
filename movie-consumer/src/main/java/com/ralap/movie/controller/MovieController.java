package com.ralap.movie.controller;

import com.ralap.movie.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * UserController
 *
 * @author: ralap
 * @date: created at 2017/10/23 21:02
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/movie/{id}")
    public User getUser(@PathVariable Integer id) {
        User user = restTemplate.getForObject("http://user-provider/getUser/" + id,
                User.class);
        return user;
    }

    @GetMapping("/test")
    public void test() {
        ServiceInstance instance = this.loadBalancerClient.choose("user-provider");
        System.out.println(
                "---------------: " + instance.getServiceId() + ": " + instance.getHost() + ": "
                        + instance
                        .getPort());
//        System.out.println(instance.toString());

        ServiceInstance instance1 = this.loadBalancerClient.choose("user-provider-2");
        System.out.println(
                "++++++++++++++++: " + instance1.getServiceId() + ": " + instance1.getHost() + ": "
                        + instance1
                        .getPort());
    }

}
