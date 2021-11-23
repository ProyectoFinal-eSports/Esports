package com.esports.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esports.converter.GameConverter;
import com.esports.converter.GameDTOConverter;
import com.esports.converter.TournamentConverter;
import com.esports.dto.GameDTO;
import com.esports.dto.TournamentDTO;
import com.esports.model.entity.Game;
import com.esports.repository.GameRepository;
import com.esports.service.GameService;
import com.esports.service.TournamentService;

@Service
public class GameServiceImpl implements GameService {

	public static final Logger logger = LoggerFactory.getLogger(GameServiceImpl.class);

	@Autowired
	private GameRepository gameRepository;

	@Autowired
	private TournamentService tournamentService;

	@Autowired
	private GameConverter gameConverter;

	@Autowired
	private GameDTOConverter gameDTOConverter;

	@Autowired
	private TournamentConverter tournamentConverter;

	@Override
	public List<GameDTO> getGameList() {
		List<Game> games = gameRepository.findAll();
		List<GameDTO> gamesDto = new ArrayList<>();
		GameDTO gameTmp;

		for (final Game game : games) {
			gameTmp = gameConverter.convert(game);
			gameTmp.setTournaments(tournamentConverter.convert(game.getTournaments()));
			gamesDto.add(gameTmp);
			logger.debug("tournaments: " + gameTmp.getTournaments());
		}
		return gamesDto;
	}

	@Override
	public GameDTO getGameById(Long id) {
		Game game = gameRepository.findById(id).orElseThrow();
		GameDTO gameDto = gameConverter.convert(game);
		gameDto.setTournaments(tournamentConverter.convert(game.getTournaments()));
		return gameDto;
	}

	@Override
	public GameDTO saveGame(GameDTO game) {
		Game gameToSave = gameDTOConverter.convert(game);
		Game gameSaved = gameRepository.save(gameToSave);

		for (TournamentDTO tournamentDto : game.getTournaments()) {
			tournamentDto.setGame(gameConverter.convert(gameSaved));
			tournamentService.saveTournament(tournamentDto);
		}

		final GameDTO gameDtoResponse = gameConverter.convert(gameSaved);
		gameDtoResponse.setTournaments(tournamentService.getTournamentsByGame(gameDtoResponse.getId()));

		return gameDtoResponse;
	}

}
