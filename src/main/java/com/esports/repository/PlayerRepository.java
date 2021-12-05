package com.esports.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esports.model.entity.Player;
import com.esports.model.entity.Role;
import com.esports.model.entity.Team;

public interface PlayerRepository extends JpaRepository<Player, Long> {

	Optional<List<Player>> findByTeam(Team team);

	Optional<List<Player>> findByRole(Role role);
}
