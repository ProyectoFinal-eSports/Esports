package com.esports.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esports.model.entity.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
