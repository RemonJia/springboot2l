package com.remon.springboot2.security;

import com.remon.springboot2.bean.User;
import com.remon.springboot2.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyUserDetailService implements UserDetailsService{
        private final UserService userService;

    public MyUserDetailService(UserService userService) {
            this.userService = userService;
        }

        @Override
        public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
            User user = userService.findUserByName(userName);
            if (null != user) {
                return user;
            }
            throw new UsernameNotFoundException("User name" + userName + "not find");

        }
}
