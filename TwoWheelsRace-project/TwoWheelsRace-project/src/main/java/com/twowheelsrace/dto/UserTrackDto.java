package com.twowheelsrace.dto;

import java.util.Date;

public class UserTrackDto {

	private String firstName;
	private String track;
	private String date_create;
	
	public UserTrackDto() {}
	
	public UserTrackDto(String firstName, String name, String date_create) {
		super();
		this.firstName = firstName;
		this.track = name;
		this.date_create = date_create;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getTrack() {
		return track;
	}
	
	public void setTrack(String name) {
		this.track = name;
	}
	
	public String getDate_create() {
		return date_create;
	}
	
	public void setDate_create(String date_create) {
		this.date_create = date_create;
	}
	

	 
}

