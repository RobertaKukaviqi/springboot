package com.twowheelsrace.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.Transient;

@Entity
@Table(name = "user_")
public class User {

	
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name = "nid")
	private String nid;
	
	@Column (name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name ="status")
	private String status;
	
	@Column(name = "role_")
	private String role_;
	
	@Transient
	private String confirmPassword;
	

	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable( name = "users_tracks" , 
    		    joinColumns = @JoinColumn (name = "user_id"),
    		    inverseJoinColumns = @JoinColumn (name = "track_id"))
	private List <Track> tracks;

	public User() {		
	}
	




	public User(String nid, String firstName, String lastName, String userName, String password, String status,
			String confirmPassword, String role, List<Track> tracks) {
		super();
		this.nid = nid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.status = status;
		this.confirmPassword = confirmPassword;
		this.role_ = role;
		this.tracks = tracks;
	}



	public String getNid() {
		return nid;
	}


	public void setNid(String nid) {
		this.nid = nid;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getRole_() {
		return role_;
	}



	public void setRole_(String role) {
		this.role_ = role;
	}



	public List<Track> getTracks() {
		return tracks;
	}



	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}

	

}