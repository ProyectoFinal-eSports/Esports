package com.esports.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esports.converter.PlayerConverter;
import com.esports.converter.PlayerDTOConverter;
import com.esports.dto.PlayerDTO;
import com.esports.model.entity.Player;
import com.esports.model.entity.Team;
import com.esports.repository.PlayerRepository;
import com.esports.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	@Autowired
	private PlayerConverter playerConverter;

	@Autowired
	private PlayerDTOConverter playerDtoConverter;

	@Override
	public List<PlayerDTO> getPlayerList() {
		List<PlayerDTO> playerList = playerConverter.convert(playerRepository.findAll());
		return playerList;

	}

	@Override
	public PlayerDTO getPlayerById(Long id) {
		PlayerDTO players = playerConverter.convert(playerRepository.getById(id));
		return players;
	}

	@Override
	public PlayerDTO savePlayer(PlayerDTO player) {
		Player playerSaved = playerRepository.save(playerDtoConverter.convert(player));
		PlayerDTO newPlayerSaved = playerConverter.convert(playerSaved);
		return newPlayerSaved;
	}

	@Override
	public List<PlayerDTO> getPlayersByTeam(Long teamId) {
		Optional<List<Player>> players = playerRepository.findByTeam(new Team(teamId));

		return playerConverter.convert(players.orElseThrow());
	}

}
