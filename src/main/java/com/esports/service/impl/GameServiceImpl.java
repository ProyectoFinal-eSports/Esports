package com.esports.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esports.converter.GameConverter;
import com.esports.converter.GameDTOConverter;
import com.esports.dto.GameDTO;
import com.esports.model.entity.Game;
import com.esports.repository.GameRepository;
import com.esports.service.GameService;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	private GameRepository gameRepository;

	@Autowired
	private GameConverter gameConverter;

	@Autowired
	private GameDTOConverter gameDTOConverter;

	@Override
	public List<GameDTO> getGameList() {
		List<Game> games = gameRepository.findAll();
		List<GameDTO> gamesDto = new ArrayList<>();
		GameDTO gameTmp;

		for (final Game game : games) {
			gameTmp = gameConverter.convert(game);
			// Set tournamentsS
			gamesDto.add(gameTmp);
		}
		return gamesDto;
	}

	@Override
	public GameDTO getGameById(Long id) {
		Game game = gameRepository.findById(id).orElseThrow();
		GameDTO gameDto = gameConverter.convert(game);

		return gameDto;
	}

	@Override
	public GameDTO saveGame(GameDTO game) {
		// TODO Auto-generated method stub
		return null;
	}

}
