package com.esports.service;

import java.util.List;

import com.esports.model.dto.TeamDTO;

public interface TeamService {

	List<TeamDTO> getTeamList();

	TeamDTO getTeamById(Long id);

	TeamDTO saveTeam(TeamDTO team);

	TeamDTO updateTeam(TeamDTO team);

	void deleteTeam(Long id);
}
