package com.eagle.crm.controller;

import com.eagle.crm.entity.User;
import com.eagle.crm.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/user")
@SuppressWarnings("unused")
public class UserController {
    @Autowired
    UserServiceImpl userServiceImpl;

    @GetMapping("/all")
    @ResponseBody
    public List<User> get_all_users(){
        List<User> users = null;
        try{
            users = userServiceImpl.selectAll();
        }catch (Throwable err){
            log.error(err.getMessage());
        }
        System.out.println(users);
        return users;
    }
}
