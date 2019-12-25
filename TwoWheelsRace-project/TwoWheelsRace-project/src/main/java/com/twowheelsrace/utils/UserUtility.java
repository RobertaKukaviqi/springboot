package com.twowheelsrace.utils;

import com.twowheelsrace.dto.UserLoginDto;
import com.twowheelsrace.entity.User;

public class UserUtility {

	private static User user;

	public UserUtility() {
		
	}
	
	public static User getUser() {
		return user;
	}

	public static void setUser(User user2) {
		UserUtility.user = user2;
	}
	
	
}
