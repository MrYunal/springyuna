package com.yuna.springboot.service;

import java.util.Map;

import com.yuna.springboot.po.User;

public interface UserService {
	
	boolean existsById(String id);
	
	Map signUp(User user);

}
