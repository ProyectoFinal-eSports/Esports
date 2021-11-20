package com.esports.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esports.converter.PlayerConverter;
import com.esports.converter.TeamConverter;
import com.esports.converter.TeamDTOConverter;
import com.esports.dto.PlayerDTO;
import com.esports.dto.TeamDTO;
import com.esports.model.entity.Team;
import com.esports.repository.TeamRepository;
import com.esports.service.PlayerService;
import com.esports.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService {

	public static final Logger logger = LoggerFactory.getLogger(TeamServiceImpl.class);

	@Autowired
	private TeamRepository teamRepository;

	@Autowired
	private PlayerService playerService;

	@Autowired
	private TeamConverter teamConverter;

	@Autowired
	private TeamDTOConverter teamDTOConverter;

	@Autowired
	private PlayerConverter playerConverter;

	@Override
	public List<TeamDTO> getTeamList() {
		List<Team> teams = teamRepository.findAll();
		List<TeamDTO> teamsDto = new ArrayList<>();
		TeamDTO teamTmp;

		for (final Team team : teams) {
			teamTmp = teamConverter.convert(team);
			teamTmp.setPlayers(playerConverter.convert(team.getPlayers()));
			// teamTmp.setPlayers(playerService.getPlayersByTeam(team.getId()));
			teamsDto.add(teamTmp);
			logger.debug("players: " + teamTmp.getPlayers());

		}
		return teamsDto;
	}

	@Override
	public TeamDTO getTeamById(Long id) {
		Team team = teamRepository.findById(id).orElseThrow();
		TeamDTO teamDto = teamConverter.convert(team);
		teamDto.setPlayers(playerConverter.convert(team.getPlayers()));
		return teamDto;
	}

	@Override
	public TeamDTO saveTeam(TeamDTO team) {
		Team teamToSave = teamDTOConverter.convert(team);
		Team teamSaved = teamRepository.save(teamToSave);

		for (PlayerDTO playerDto : team.getPlayers()) {
			playerDto.setTeam(teamConverter.convert(teamSaved));
			playerService.savePlayer(playerDto);
		}

		final TeamDTO teamDtoResponse = teamConverter.convert(teamSaved);
		teamDtoResponse.setPlayers(playerService.getPlayersByTeam(teamDtoResponse.getId()));
		return teamDtoResponse;
	}

}
