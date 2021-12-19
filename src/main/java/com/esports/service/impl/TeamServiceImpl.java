package com.esports.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esports.converter.PlayerConverter;
import com.esports.converter.TeamConverter;
import com.esports.converter.TeamDTOConverter;
import com.esports.model.dto.PlayerDTO;
import com.esports.model.dto.TeamDTO;
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
		team.setId(teamSaved.getId());

		return team;
	}

	@Override
	public TeamDTO updateTeam(TeamDTO team) {
		Optional<Team> teamToUpdate = teamRepository.findById(team.getId());
		if (!teamToUpdate.isPresent())
			return null;

		Team teamToSave = teamDTOConverter.convert(team);
		Team teamSaved = teamRepository.save(teamToSave);

		return team;
	}

	@Override
	public void deleteTeam(Long id) {
		teamRepository.deleteById(id);
	}

}
