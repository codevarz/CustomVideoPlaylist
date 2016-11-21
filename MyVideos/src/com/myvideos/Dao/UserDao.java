package com.myvideos.Dao;

import java.util.List;

import com.myvideos.model.User;

public interface UserDao {

	public void saveUser(User user);
	public List<User> getUserByUsername(String username);
}
