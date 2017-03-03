package com.dy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dy.dao.UserDao;
import com.dy.model.User;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public String add(User user) {
		userDao.save(user);
		//return "add sucess!";
		//return "{\"code\":1, \"message\":\"add success\"}";
		return "";
	}
	
	public String addUser(String account) {
		User user = new User();
		user.setAccount(account);
		userDao.save(user);
		return "add success!";
	}
	
	public User getOneUser(Long id) {
		return userDao.findOne(id);
	}
}
