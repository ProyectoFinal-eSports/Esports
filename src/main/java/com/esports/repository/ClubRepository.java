package com.esports.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esports.model.entity.Club;

public interface ClubRepository extends JpaRepository<Club, Long> {

}
