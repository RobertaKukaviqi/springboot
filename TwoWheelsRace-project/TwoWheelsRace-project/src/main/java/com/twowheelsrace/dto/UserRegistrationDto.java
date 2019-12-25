package com.twowheelsrace.dto;

import org.hibernate.validator.constraints.NotEmpty;

public class UserRegistrationDto {

	
        @NotEmpty
        private String nid;
        
	    @NotEmpty
	    private String firstName;

	    @NotEmpty
	    private String lastName;
	    
	    @NotEmpty
	    private String userName;

	    @NotEmpty
	    private String password;

	    @NotEmpty
	    private String confirmPassword;

	    private String role_;
	    
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

		public String getRole_() {
			return role_;
		}

		public void setRole_(String role) {
			this.role_ = role;
		}

	    
	    
}
