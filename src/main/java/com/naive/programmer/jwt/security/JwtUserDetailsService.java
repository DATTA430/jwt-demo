package com.naive.programmer.jwt.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.naive.programmer.jwt.model.User;
import com.naive.programmer.jwt.repos.UserRepository;
import static org.springframework.security.core.userdetails.User.withUsername;
@Component
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUsername(username).orElseThrow(
				() -> new UsernameNotFoundException(String.format("User with name %s does not exist", username)));
		return withUsername(user.getUsername())
				.password(user.getPassword())
				.authorities(user.getRoles())
				.accountExpired(false)
				.accountLocked(false)
				.credentialsExpired(false)
				.disabled(false)
				.build();
	}

}
