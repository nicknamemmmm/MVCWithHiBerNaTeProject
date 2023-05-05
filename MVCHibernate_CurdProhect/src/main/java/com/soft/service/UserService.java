package com.soft.service;

import java.util.List;

import com.soft.entity.User;

public interface UserService {

	public int saveandperformbussinesslogic(User user);
	public List<User> getalluser();
	public void deleteByUserId(int id);
}
