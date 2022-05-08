package com.naive.programmer.jwt.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "security_role")
public class Role implements GrantedAuthority{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8177921190694440630L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long roleId;
	private String role;
	@JsonIgnoreProperties("roles")
	@ManyToMany(mappedBy = "roles")
	private Set<User> users;
	@Override
	public String getAuthority() {
		return role;
	}
}
