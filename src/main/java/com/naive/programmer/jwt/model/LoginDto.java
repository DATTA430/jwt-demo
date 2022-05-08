package com.naive.programmer.jwt.model;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {

	@NotNull
	private String username;
	@NotNull
	private String password;
	private String firstName;
	private String lastName;
}
