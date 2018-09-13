package com.remon.springboot2;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {
    @org.junit.Test
    public  void testEncode(){
        System.out.println(new BCryptPasswordEncoder(11).encode("jym"));
    }
}
