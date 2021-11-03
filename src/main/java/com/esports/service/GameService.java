package com.esports.service;

import java.util.List;

import com.esports.dto.GameDTO;

public interface GameService {

	List<GameDTO> getGameList();

	GameDTO getGame(Long id);

	GameDTO getGameById(Long id);

	GameDTO saveGame(GameDTO game);

	GameDTO updateGame(Long id, GameDTO game);

	void deleteGame(Long id);

	List<GameDTO> getGameListByGenre(Long id);
}
