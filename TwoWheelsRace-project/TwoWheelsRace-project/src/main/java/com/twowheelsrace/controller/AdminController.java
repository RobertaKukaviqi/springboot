package com.twowheelsrace.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.twowheelsrace.dto.UserRegistrationDto;
import com.twowheelsrace.entity.User;
import com.twowheelsrace.service.UserService;

@RestController
public class AdminController {
	
	@Autowired
	UserService userService;

	@RequestMapping(value = "/admin")
	@GetMapping
	public ModelAndView adminPage() {
		ModelAndView mav = null;
		mav = new ModelAndView("admin-home");
		mav.addObject("listUser", userService.getUsers());
		return mav;
	}
	
/*	@PostMapping
	public void validateUser (@ModelAttribute("validate") User validate) {
		String status = null;
		
		System.out.println(validate.getNid());
		System.out.println(validate.getStatus());
		
		if (validate.getStatus().equals('0')) {
			status = "Invalid";
		}else{
			status = "Valid";
		}
		
		String nid = validate.getNid();
		
		userService.validateUser(status, nid);
	}
	*/
}
