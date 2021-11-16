package com.esports.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.esports.dto.GameDTO;
import com.esports.repository.GameRepository;
import com.esports.service.GameService;

@Service
public class GameServiceImpl implements GameService {

	private GameRepository gameRepository;

	@Override
	public List<GameDTO> getGameList() {
		return List.of(new GameDTO(1L, "League of Legends", "MOBA", "Riot Games,Worlds", "../img/game.png"),
				new GameDTO(2L, "CS:GO", "FPS", "Valve", "../img/game.png"));
	}

	@Override
	public GameDTO getGame(Long id) {
		return new GameDTO(1L, "League of Legends", "MOBA", "Riot Games,Worlds", "../img/game.png");
	}

	@Override
	public GameDTO getGameById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
