package com.tutorial.springboot.auth.repository;

import com.tutorial.springboot.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}