package com.esports.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esports.model.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

	Optional<List<Player>> findByTeam(Long teamId);
}
