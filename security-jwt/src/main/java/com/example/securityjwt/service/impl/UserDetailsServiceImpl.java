package com.example.securityjwt.service.impl;

import com.example.securityjwt.domain.JwtUser;
import com.example.securityjwt.entity.pojo.User;
import com.example.securityjwt.entity.query.UserQuery;
import com.example.securityjwt.mapper.UserMapper;
import com.example.securityjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserDetailsServiceImpl  implements UserDetailsService {

    @Resource
    private UserMapper<User, UserQuery> userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserQuery query = new UserQuery();
        query.setUserName(s);
        User user = userMapper.selectList(query).get(0);
        return new JwtUser(user);
    }
}
