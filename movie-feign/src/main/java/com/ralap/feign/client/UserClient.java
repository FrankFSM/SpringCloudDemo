package com.ralap.feign.client;

import com.ralap.feign.config.FooConfigration;
import com.ralap.feign.domain.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * UserClient
 *
 * @author: ralap
 * @date: created at 2017/10/29 18:24
 */
@FeignClient(name = "user-provider", configuration = FooConfigration.class)
public interface UserClient {

//    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
//    User getUser(@PathVariable(value = "id") Integer id);

//    @RequestMapping(value = "/changeUser", method = RequestMethod.POST)
//    User changeUser(@RequestBody User user);


    @RequestLine("GET /getUser/{id}")
    User getUser(@Param("id") Integer id);

}
