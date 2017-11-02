package com.ralap.user.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.ralap.user.domain.User;
import com.ralap.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author: ralap
 * @date: created at 2017/10/23 19:46
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private EurekaClient eurekaClient;


    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Integer id) {
        User user = userService.getUserById(id);
        return user;
    }

    @GetMapping("/eureka-instance")
    public String ServiceUrl() {
        InstanceInfo info = eurekaClient.getNextServerFromEureka("USER-PROVIDER", false);
        return info.getHomePageUrl();
    }

    @PostMapping(value = "/changeUser")
    public User changeUser(@RequestBody User user){
            return user;
    }


}
