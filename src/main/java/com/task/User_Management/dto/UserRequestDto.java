package com.task.User_Management.dto;

public class UserRequestDto {
	  private String name;
	    private String email;
	    private String password;

	    public UserRequestDto() {
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

		public UserRequestDto(String name, String email, String password) {
		
			this.name = name;
			this.email = email;
			this.password = password;
		}
		
}
