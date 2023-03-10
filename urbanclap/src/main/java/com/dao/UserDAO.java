package com.dao;

import java.util.List;


import com.model.User;

public interface UserDAO {

	public void addUser(User user);
	public void updateUser(User user);
	public List<User> listUsers();
	public User getUserByPhone(String id);
}
