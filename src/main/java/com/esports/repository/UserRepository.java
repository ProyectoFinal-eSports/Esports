package com.esports.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esports.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User getByLoginname(String loginname);
}
