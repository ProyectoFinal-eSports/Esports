package com.esports.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esports.model.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
