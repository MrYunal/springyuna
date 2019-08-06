package com.yuna.springboot.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuna.springboot.po.User;
import com.yuna.springboot.repo.UserDao;
import com.yuna.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;

	@Override
	public boolean existsById(String id) {
		return userDao.existsById(id);
	}

	@Override
	public Map signUp(User user) {
		existsById("wdsfs");
		return null;
	}
}
