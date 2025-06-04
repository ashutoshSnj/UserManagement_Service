package com.task.User_Management.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserRegistrationDto {

	 @NotBlank(message = "Name is required")
	    private String name;

	    @Email(message = "Invalid email")
	    @NotBlank(message = "Email is required")
	    private String email;

	    @NotBlank(message = "Password is required")
	    private String password;

	    private String role; 
	    
	    public UserRegistrationDto() {
			// TODO Auto-generated constructor stub
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public UserRegistrationDto(@NotBlank(message = "Name is required") String name,
				@Email(message = "Invalid email") @NotBlank(message = "Email is required") String email,
				@NotBlank(message = "Password is required") String password, String role) {
			super();
			this.name = name;
			this.email = email;
			this.password = password;
			this.role = role;
		}
	    
}
