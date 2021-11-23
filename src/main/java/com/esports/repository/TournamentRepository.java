package com.esports.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esports.model.entity.Game;
import com.esports.model.entity.Tournament;

public interface TournamentRepository extends JpaRepository<Tournament, Long> {

	Optional<List<Tournament>> findByGame(Game game);
}
