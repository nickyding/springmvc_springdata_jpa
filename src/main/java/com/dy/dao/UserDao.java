package com.dy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dy.model.User;

public interface UserDao extends JpaRepository<User, Long> {
	
}
