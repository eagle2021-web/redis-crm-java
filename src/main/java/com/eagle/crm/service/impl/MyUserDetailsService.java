package com.eagle.crm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.eagle.crm.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
//import com.eagle.crm.entity.User;
import java.util.List;
@Slf4j
@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(111111);
        //调用usersMapper方法，根据用户名查询数据库
        QueryWrapper<com.eagle.crm.entity.User> wrapper = new QueryWrapper();
        QueryWrapper<com.eagle.crm.entity.User> id = wrapper.eq("id", 1);
        log.info(id + "");
//        // where username=?
//        wrapper.eq("username",username);
//        Users users = usersMapper.selectOne(wrapper);
//        //判断
//        if(users == null) {//数据库没有用户名，认证失败
//            throw  new UsernameNotFoundException("用户名不存在！");
//        }
        List<GrantedAuthority> auths =
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin,ROLE_sale");
        //从查询数据库返回users对象，得到用户名和密码，返回
//        return new User(users.getUsername(),
//                new BCryptPasswordEncoder().encode(users.getPassword()),auths);
        return new User("123",
                new BCryptPasswordEncoder().encode("231"),auths);
    }
}
