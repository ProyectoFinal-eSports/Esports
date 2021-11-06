package com.esports.repository;

import com.esports.model.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Game, Long> {
}
