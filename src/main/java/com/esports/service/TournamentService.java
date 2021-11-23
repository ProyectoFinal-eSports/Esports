package com.esports.service;

import java.util.List;

import com.esports.dto.TournamentDTO;

public interface TournamentService {

	List<TournamentDTO> getTournamentList();

	TournamentDTO getTournamentById(Long id);

	TournamentDTO saveTournament(TournamentDTO tournament);

	List<TournamentDTO> getTournamentsByGame(Long gameId);

}
