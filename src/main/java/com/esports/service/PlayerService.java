package com.esports.service;

import java.util.List;

import com.esports.model.dto.PlayerDTO;

public interface PlayerService {

	List<PlayerDTO> getPlayerList();

	PlayerDTO getPlayerById(Long id);

	PlayerDTO savePlayer(PlayerDTO player);

	List<PlayerDTO> getPlayersByTeam(Long teamId);
	
	List<PlayerDTO> getPlayersByRole(Long roleId);
	
	void deletePlayer(Long id);

}
