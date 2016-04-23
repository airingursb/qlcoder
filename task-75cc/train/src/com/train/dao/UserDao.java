package com.train.dao;

import com.train.entity.User;

public interface UserDao {

	public void saveUser(User user);
	
	public User searchUser(String username);
}
