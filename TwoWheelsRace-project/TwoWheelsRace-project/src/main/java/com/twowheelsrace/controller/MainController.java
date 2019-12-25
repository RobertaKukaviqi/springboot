package com.twowheelsrace.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

	@GetMapping("/welcome")
    public ModelAndView welcome() {
        return  new ModelAndView ("welcome");
    }

   
}
