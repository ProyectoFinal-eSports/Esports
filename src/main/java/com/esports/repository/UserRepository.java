package com.esports.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esports.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public Optional<User> findByLoginname(String loginname);

}
