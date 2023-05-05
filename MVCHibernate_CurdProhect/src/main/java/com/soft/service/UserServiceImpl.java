package com.soft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soft.dao.SaveUserDAO;
import com.soft.entity.User;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	private SaveUserDAO saveUserdao;
	@Override
	public int saveandperformbussinesslogic(User user) {
		
		return saveUserdao.saveuserdatabasebyusinghibernate(user);
	}
	@Override
	public List<User> getalluser() {
		
		return saveUserdao.saveuserdatabase();
	}
	@Override
	public void deleteByUserId(int userid) {
		
		 saveUserdao.deletebyuserid(userid);
		
	}

}
