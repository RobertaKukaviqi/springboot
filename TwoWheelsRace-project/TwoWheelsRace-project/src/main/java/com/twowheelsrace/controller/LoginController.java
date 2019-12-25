package com.twowheelsrace.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import com.twowheelsrace.dto.UserLoginDto;
import com.twowheelsrace.entity.User;
import com.twowheelsrace.service.TrackService;
import com.twowheelsrace.service.UserService;
import com.twowheelsrace.utils.UserUtility;


@RequestMapping(value = "/login")
@RestController
public class LoginController {

	@Autowired
	UserService userService;
	
	@Autowired
	TrackService trackService;
	
	
	@Autowired
	AdminController adminController;
	
	@Autowired
	UserController userController;
	
	 @GetMapping
	 public ModelAndView login() {
	        return new ModelAndView ("login");
	 }
	 
/*	 @ModelAttribute("trackList")
	 public List <String> getTrackList(){
		 List <String> trackList = new ArrayList<>();
		 trackList = trackService.getTracks();
		 System.out.println(trackList);	
		 return trackList;
	 }
	 
*/
	
	 @PostMapping
	 public ModelAndView userLogin (@ModelAttribute ("loginUser") UserLoginDto loginUser) {
		 
		 ModelAndView adminPage = adminController.adminPage();
		 ModelAndView userPage = userController.userPage();
		 ModelAndView mv = null;
		 
		 User user = userService.validUser(loginUser);
		 
		if (user != null) {
			
			UserUtility.setUser(user);
			
			if (user.getUserName().equals("admin")) {
				adminPage.addObject("firstname", user.getFirstName());
				return adminPage;
				
			}else {
				String firstName = user.getFirstName();
				userPage.addObject("firstname", firstName);
				return userPage;
				}
		}else {
			mv = new ModelAndView ("login");
			mv.addObject("message", "Username ose Password eshte i pasakte!");
			return mv;
		}
	 }
}
