package com.naive.programmer.jwt.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naive.programmer.jwt.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String username);

}
