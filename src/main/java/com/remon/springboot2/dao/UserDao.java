package com.remon.springboot2.dao;

import com.remon.springboot2.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
	User getUserById(@Param("id") long id);
	User getUserByUsername(@Param("uname") String username);
	int updateUser(@Param("di") User user);
	int insertUser(@Param("di") User user);
	int deleteUser(@Param("di") long id);
}
