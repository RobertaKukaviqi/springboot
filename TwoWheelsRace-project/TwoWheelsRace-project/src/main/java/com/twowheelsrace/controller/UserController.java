package com.twowheelsrace.controller;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.twowheelsrace.dto.UserTrackDto;
import com.twowheelsrace.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired	
	UserService userService;
	
	//@RequestMapping(value = "/user")
	@GetMapping
	public ModelAndView userPage() {
		ModelAndView mav = null;
		mav = new ModelAndView("user-home");
		
		return mav;
	} 
	

	@PostMapping
	public ModelAndView createTrack (@ModelAttribute("user_track") UserTrackDto userTrack) {
		System.out.println(userTrack.getDate_create());
		ModelAndView mv = userPage();
		userService.createTrack(userTrack);
		mv.addObject("messageCreate", "Korsia u krijua me sukses!" );
		return mv;
	}
}
