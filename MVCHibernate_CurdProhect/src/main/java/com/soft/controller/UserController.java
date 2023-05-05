package com.soft.controller;

import java.util.List;

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

	@Autowired
	private UserService userservice;
	
	@RequestMapping(value="/saveuserdb" , method=RequestMethod.POST)
	public String saveUser(@ModelAttribute User user) {
		int saveUser = userservice.saveandperformbussinesslogic(user);
		ModelAndView mav = new ModelAndView();
		String displayurl = "/getalluser";
				return "redirect:"+displayurl;
	}
	@RequestMapping(value="/getalluser",method=RequestMethod.GET)
	public ModelAndView getalluser(@ModelAttribute User user) {
		
		List<User> Userlist = userservice.getalluser();
		ModelAndView mav =new ModelAndView();
		mav.addObject("Userlist" ,Userlist);
		mav.setViewName("display");
		return mav;
		}
	@RequestMapping(value="/updateUserForm",method=RequestMethod.GET)
	public String deletebyId(@RequestParam int id) {
		
		userservice.deleteByUserId(id);
		ModelAndView mav = new ModelAndView();
		
		String displayurl = "/getalluser";
		return "redirect:"+displayurl;
	}
}
