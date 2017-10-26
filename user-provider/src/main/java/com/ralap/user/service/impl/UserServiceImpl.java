package com.ralap.user.service.impl;

import com.netflix.discovery.converters.Auto;
import com.ralap.user.domain.User;
import com.ralap.user.mapper.UserMapper;
import com.ralap.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 *
 * @author: ralap
 * @date: created at 2017/10/23 19:54
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectUserById(id);
    }
}
