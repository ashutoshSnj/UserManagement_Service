package com.task.User_Management.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserLoginDto {
	@Email(message ="Invalid email")
	@NotBlank(message="password is requried")
    private String email;
	
	  @NotBlank(message = "Password is required")
    private String password;
	  
	  public UserLoginDto() {
		// TODO Auto-generated constructor stub
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

	public UserLoginDto(@Email(message = "Invalid email") @NotBlank(message = "password is requried") String email,
			@NotBlank(message = "Password is required") String password) {
		super();
		this.email = email;
		this.password = password;
	}
	  
}
