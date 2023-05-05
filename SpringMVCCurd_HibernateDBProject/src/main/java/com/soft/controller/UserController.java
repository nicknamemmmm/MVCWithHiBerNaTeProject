package com.soft.controller;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.soft.entity.User;
import com.soft.service.UserService;




@Controller
public class UserController {

	@Autowired                           //Autowire setter injection in Userservice Class
	private UserService userService;
	
	@RequestMapping(value="/saveuser",method = RequestMethod.POST)//DATA POSTED
	public String saveUser(@ModelAttribute User user) {       //read all in User class object
		
		int saveUserId = userService.saveUserService(user);          //user can pass the UserService class and Method is saveUservice(user) And declaire this method in userservice class
		
		ModelAndView mav = new ModelAndView();         //model (DATA) AND view(JSP PAGE)
		System.out.println(user.getEmail());
		mav.addObject("saveUserId", saveUserId);//ALL USER SAVE IN KEY AND VALUE PAIR AND DESPLAY THE DISPLAY PAGE
	    
		String displayUrl = "/getAllUser";               //BY USING KEY TO INTITIALISE GETATRIBUTE IN DIPLAY.JSP PAGE (USER user = (USER)request.getAtribute(saveUserId) also CAST IS IMPORTENT
		
		return "redirect:"+displayUrl;
	}
	@RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
	public ModelAndView getAllUser() {          //GET ALL SAVED USER IN DESPLAY PAGE
		
		List<User> userList = userService.getAllUsereService();
		
		System.out.println(userList);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("userList", userList);
		
		mav.setViewName("display");
		
		return mav;
	}
	@RequestMapping(value = "/deleteById",method= RequestMethod.GET)
	public String deleteById(@RequestParam int id) {
		userService.deleteByIsService(id);
		ModelAndView mav = new ModelAndView();
        String displayUrl = "/getAllUser";               //BY USING KEY TO INTITIALISE GETATRIBUTE IN DIPLAY.JSP PAGE (USER user = (USER)request.getAtribute(saveUserId) also CAST IS IMPORTENT
		
		return "redirect:"+displayUrl;
		
	}
	@RequestMapping(value="/updateUserForm")
public ModelAndView updateUserForm(@RequestParam int id){
	ModelAndView mav = new ModelAndView();
	
	User existUser = userService.getuserByIdService(id);
	System.out.println(existUser);
	mav.addObject("ExistUser", existUser);
	mav.setViewName("updateUser");
	
	return mav;
	
	}
	@RequestMapping(value = "/updateUser",method=RequestMethod.POST)
	ModelAndView updateExistUser(@ModelAttribute User user){
		
	ModelAndView mav = new ModelAndView();
	userService.updateExistUserService(user);
	mav.setViewName("index");
	
		return mav;
	}
}
