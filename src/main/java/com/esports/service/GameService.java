package com.esports.service;

import java.util.List;

import com.esports.dto.GameDTO;

public interface GameService {

	List<GameDTO> getGameList();

	GameDTO getGameById(Long id);

	GameDTO saveGame(GameDTO game);
}
