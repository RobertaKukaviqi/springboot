

package com.twowheelsrace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.twowheelsrace.dto.UserRegistrationDto;
import com.twowheelsrace.service.UserService;


@RestController
@RequestMapping( value = "/registration")
public class RegistrationController {

	@Autowired
	UserService userService;
	
	 @ModelAttribute("user")
	    public UserRegistrationDto userRegistrationDto() {
	        return new UserRegistrationDto();
	    }

	@GetMapping
	public ModelAndView showRegisterPage(){
		return new ModelAndView("register");
	}
	
	
	@PostMapping
	public ModelAndView saveUser(@ModelAttribute("user") UserRegistrationDto user) {	
		
		
		if (user.getUserName().equals("admin")) {	
			user.setRole_("admin");		
		}else {
			user.setRole_("garues");
		}
			
		userService.saveUser(user);
		return new ModelAndView("success");	
	}
}
