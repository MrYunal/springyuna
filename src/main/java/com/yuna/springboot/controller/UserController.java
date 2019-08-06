package com.yuna.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuna.springboot.po.User;
import com.yuna.springboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/signup")
	public String signUp(@RequestBody User user) {
		
		return null;
	}
	
	@RequestMapping("/existsById/{id}")
	public boolean findUserById(@PathVariable("id") String id) {
		if(userService.existsById(id)) {
			return true;
		}
		return false;
	}

}
