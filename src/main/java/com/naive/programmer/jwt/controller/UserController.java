package com.naive.programmer.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naive.programmer.jwt.model.LoginDto;
import com.naive.programmer.jwt.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/signin")
	public Authentication login(@RequestBody LoginDto loginDto) {
		return userService.sigin(loginDto.getUsername(),loginDto.getPassword());

	}
	
}
