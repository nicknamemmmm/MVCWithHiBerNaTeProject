package com.soft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.soft.entity.ProductName;
import com.soft.service.ProductServiecei;



@Controller
public class ProductController {

	@Autowired
	private ProductServiecei productservicei;
	@RequestMapping(value="/UserSaveInDb",method=RequestMethod.POST)
	public ModelAndView saveproduct(@ModelAttribute ProductName productname) {
		int saveUserProduct =  productservicei.saveProduct(productname);
		ModelAndView mav = new  ModelAndView();
		mav.addObject("saveUserProduct", saveUserProduct);
        return mav;
	}
	@RequestMapping(value="/getalluserdbintopage",method=RequestMethod.GET)
	public ModelAndView getalluesrinlist() {
		
		List<ProductName> userlest = productservicei.getallProduct();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display");
		mav.addObject("userlest", userlest);
		return mav;
	}
	@RequestMapping(value="/eexistuser")
	public ModelAndView existuser(@RequestParam int id) {
		ModelAndView mav = new ModelAndView();
		ProductName user = productservicei.prodeuctusergetbyid(id);
		System.out.println(user);
		mav.addObject("User", user);
		mav.setViewName("updateproduct");
		return mav;
		
	}
}
