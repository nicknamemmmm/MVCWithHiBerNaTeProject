package com.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.soft.model.User;

@Controller

public class UserController {

	@RequestMapping(value="/saveUser",method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute User user) {
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		System.out.println(user.getAddress());
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("userDetails",user);
		mav.setViewName("display");
		return mav;
	}
}
