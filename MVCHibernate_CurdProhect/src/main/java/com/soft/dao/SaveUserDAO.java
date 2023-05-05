package com.soft.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.soft.entity.User;
@Component
public class SaveUserDAO {

	@Autowired
	private HibernateTemplate hibernateTemplet;
	@Transactional
	public int saveuserdatabasebyusinghibernate(User user) {
		int userId = (int) hibernateTemplet.save(user);
		return userId;
	}
	public List<User> saveuserdatabase(){
		List<User> list = hibernateTemplet.loadAll(User.class);
		
		return list;
	}
	@Transactional
	public void deletebyuserid(int userid) {
		User checkuser = hibernateTemplet.get(User.class, userid);
		if(checkuser!=null) {
			hibernateTemplet.delete(checkuser);
		}else {
			System.out.println("User Not Found");
		}
	}
}
