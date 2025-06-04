package com.task.User_Management.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import com.task.User_Management.dto.UserLoginDto;
import com.task.User_Management.dto.UserRegistrationDto;
import com.task.User_Management.entity.Role;
import com.task.User_Management.entity.User;
import com.task.User_Management.repository.RoleRepository;
import com.task.User_Management.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

	  private final UserRepository userRepository;
	    private final RoleRepository roleRepository;
	    private final PasswordEncoder passwordEncoder;
	    
	    
		public AuthService(UserRepository userRepository, RoleRepository roleRepository,
				PasswordEncoder passwordEncoder) {
			this.userRepository = userRepository;
			this.roleRepository = roleRepository;
			this.passwordEncoder = passwordEncoder;
		}

		public User registerUser(UserRegistrationDto registrationDto) {
	        // Check if email already exists
	        if(userRepository.existsByEmail(registrationDto.getEmail())) {
	            throw new RuntimeException("Email already in use");
	        }

	        User user = new User();
	        user.setName(registrationDto.getName());
	        user.setEmail(registrationDto.getEmail());
	        user.setPassword(passwordEncoder.encode(registrationDto.getPassword()));

	        // Set role
	        String roleName = registrationDto.getRole() != null ? registrationDto.getRole() : "ROLE_USER";
	        Role role = roleRepository.findByName(roleName)
	                .orElseThrow(() -> new RuntimeException("Role not found: " + roleName));

	        Set<Role> roles = new HashSet<>();
	        roles.add(role);
	        user.setRoles(roles);

	        return userRepository.save(user);
	    }

	    public Optional<User> loginUser(UserLoginDto loginDto) {
	        // For now, just fetch user by email
	        Optional<User> userOpt = userRepository.findByEmail(loginDto.getEmail());

	        // Password validation will be done in Security layer or controller
	        return userOpt;
	    }
	    
}
