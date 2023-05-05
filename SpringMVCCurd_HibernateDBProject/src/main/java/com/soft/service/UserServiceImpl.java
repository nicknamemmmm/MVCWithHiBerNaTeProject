package com.soft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soft.dao.UserDAO;
import com.soft.entity.User;

@Component
public class UserServiceImpl implements UserService {
   @Autowired
	private UserDAO userDAO;
	
	@Override
	public int saveUserService(User user) {
		
		return userDAO.saveUserDAO(user);
	}

	@Override
	public List<User> getAllUsereService() {
		
		return userDAO.getAlluserDAO();
	}

	@Override
	public void deleteByIsService(int userId) {
		userDAO.deletebyIdDAO(userId);
		
	}

	@Override
	public User getuserByIdService(int userid) {
		
		return userDAO.gateByIdDAO(userid);
	}

	@Override
	public void updateExistUserService(User user) {
		userDAO.updateExistUserDAO(user);
		
	}

	
}
