package com.prokopiv.sombra.service;

import java.util.List;

import com.prokopiv.sombra.model.User;
import com.prokopiv.sombra.validation.Pagination;

public interface UserService {

	public List<User> getUserList(Pagination pagination);
	public void deleteUser(String id);
	public void recoveryUser(String id);
	public User getUserById(String id);
	public void updateUser(User user);
	public boolean userExist(String login);
	public void insertUser(User user);
}
