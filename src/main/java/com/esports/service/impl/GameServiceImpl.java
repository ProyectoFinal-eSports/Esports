package com.esports.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.esports.dto.GameDTO;
import com.esports.repository.GameRepository;
import com.esports.service.GameService;

@Service
public class GameServiceImpl implements GameService {

	private GameRepository gameRepo;

	@Override
	public List<GameDTO> getGameList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameDTO getGameById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameDTO saveGame(GameDTO game) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameDTO updateGame(Long id, GameDTO game) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteGame(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<GameDTO> getGameListByGenre(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
