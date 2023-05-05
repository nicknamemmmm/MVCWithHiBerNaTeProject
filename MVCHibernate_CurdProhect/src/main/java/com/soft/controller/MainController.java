package com.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/index")
	public String homecontroller() {
		return "index";
	}
	@RequestMapping("/userform")
	public String userform() {
		return "userform";
	}
}
