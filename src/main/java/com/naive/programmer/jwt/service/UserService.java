package com.naive.programmer.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.naive.programmer.jwt.configuration.RoleRepository;
import com.naive.programmer.jwt.repos.UserRepository;
@Service
public class UserService {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RoleRepository roleRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public Authentication sigin(String username, String password) {
		
		return  authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
	}

}
