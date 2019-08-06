package com.yuna.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yuna.springboot.po.User;

@Repository
public interface UserDao extends JpaRepository<User, String>{
	
}
