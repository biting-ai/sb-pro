package com.jerryring.controller;

import com.jerryring.entitiy.User;
import com.jerryring.jpa.UserJPA;
import com.jerryring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author broker
 * @version v1.0
 * @date 2018-09-26
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserJPA userJPA;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> list() {
        return userMapper.getUser(32);
    }
}
