package com.eagle.crm.service.impl;

import com.eagle.crm.bean.User3;
import com.eagle.crm.mapper.UserMapper;
import com.eagle.crm.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User3> implements UserService {


}
