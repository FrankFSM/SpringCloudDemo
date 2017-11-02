package com.ralap.feign.controller;


import com.ralap.feign.client.UserClient;
import com.ralap.feign.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author: ralap
 * @date: created at 2017/10/23 21:02
 */
@RestController
public class MovieController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/movie/{id}")
    public User getUser(@PathVariable Integer id) {
        return userClient.getUser(id);
    }

//    @GetMapping(value = "/changeUser")
//    public User chanageUser(User user) {
//        return userClient.changeUser(user);
//    }


}
