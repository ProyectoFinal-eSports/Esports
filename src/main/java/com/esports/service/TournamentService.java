package com.esports.service;

import java.util.List;

import com.esports.model.dto.GameDTO;
import com.esports.model.dto.TournamentDTO;

public interface TournamentService {

	List<TournamentDTO> getTournamentList();

	TournamentDTO getTournamentById(Long id);

	TournamentDTO saveTournament(TournamentDTO tournament);

	TournamentDTO updateTournament(TournamentDTO tournamentDTO);

	void deleteTournament(Long id);

	List<TournamentDTO> getTournamentsByGame(Long gameId);

}
