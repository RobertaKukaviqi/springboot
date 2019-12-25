package com.twowheelsrace.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.JoinTable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twowheelsrace.dto.UserLoginDto;
import com.twowheelsrace.dto.UserRegistrationDto;
import com.twowheelsrace.dto.UserTrackDto;
import com.twowheelsrace.entity.User;
import com.twowheelsrace.repository.TrackRepository;
import com.twowheelsrace.repository.UserRepository;
import com.twowheelsrace.utils.UserUtility;

@Service
public class UserService {

	@Autowired
	private UserRepository userRep;

	@Autowired
	private TrackRepository trackRep;
	
	
	public void addUser (User user) {
		userRep.save(user);
	}
	
	public User getByUserName (String userName) {
		return userRep.findByUserName(userName);
	}
	
	public User saveUser(UserRegistrationDto registration) {
        User user = new User();
      
        user.setNid(registration.getNid());
        user.setFirstName(registration.getFirstName());
        user.setLastName(registration.getLastName());
        user.setUserName(registration.getUserName());
        user.setPassword(registration.getPassword());
        user.setRole_(registration.getRole_());
    
        return userRep.save(user);
    }
	
	public User validUser (UserLoginDto loginUser) {
		
		return userRep.findUser(loginUser.getUserName(), loginUser.getPassword());
	}
	

	public Iterable <User> getUsers (){
	 return	userRep.userList();
		
	}

	public void validateUser(String status, String nid) {
			userRep.validateUser(status, nid);
	}
	
	public void createTrack (UserTrackDto userTrack) {
		
		String nid = UserUtility.getUser().getNid();
		System.out.println(userTrack.getTrack());
		int track_id = trackRep.findTrackByName(userTrack.getTrack()).get(0).getId();		
		String date_create = userTrack.getDate_create();
		
		userRep.insertUserTrack(nid, track_id, date_create);
	}
}