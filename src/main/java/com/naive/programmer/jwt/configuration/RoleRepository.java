package com.naive.programmer.jwt.configuration;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naive.programmer.jwt.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long>{

}
