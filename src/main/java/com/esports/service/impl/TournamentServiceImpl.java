package com.esports.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esports.converter.TournamentConverter;
import com.esports.converter.TournamentDTOConverter;
import com.esports.model.dto.TournamentDTO;
import com.esports.model.entity.Game;
import com.esports.model.entity.Tournament;
import com.esports.repository.TournamentRepository;
import com.esports.service.TournamentService;

@Service
public class TournamentServiceImpl implements TournamentService {

	@Autowired
	private TournamentRepository tournamentRepository;

	@Autowired
	private TournamentConverter tournamentConverter;

	@Autowired
	private TournamentDTOConverter tournamentDTOConverter;

	@Override
	public List<TournamentDTO> getTournamentList() {
		List<TournamentDTO> tournamentList = tournamentConverter.convert(tournamentRepository.findAll());
		return tournamentList;
	}

	@Override
	public TournamentDTO getTournamentById(Long id) {
		TournamentDTO tournaments = tournamentConverter.convert(tournamentRepository.getById(id));
		return tournaments;
	}

	@Override
	public TournamentDTO saveTournament(TournamentDTO tournament) {
		Tournament tournamentSaved = tournamentRepository.save(tournamentDTOConverter.convert(tournament));
		TournamentDTO newTournamentSaved = tournamentConverter.convert(tournamentSaved);
		return newTournamentSaved;
	}

	@Override
	public TournamentDTO updateTournament(TournamentDTO tournamentDTO) {
		Optional<Tournament> tournament = tournamentRepository.findById(tournamentDTO.getId());
		if (!tournament.isPresent())
			return null;

		Tournament tournamentSaved = tournamentRepository.save(tournamentDTOConverter.convert(tournamentDTO));
		TournamentDTO newTournamentSaved = tournamentConverter.convert(tournamentSaved);
		return newTournamentSaved;
	}

	@Override
	public List<TournamentDTO> getTournamentsByGame(Long gameId) {
		Optional<List<Tournament>> tournaments = tournamentRepository.findByGame(new Game(gameId));

		return tournamentConverter.convert(tournaments.orElseThrow());
	}

	@Override
	public void deleteTournament(Long id) {
		tournamentRepository.deleteById(id);
	}

}
