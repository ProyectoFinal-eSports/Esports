package com.esports.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.esports.model.dto.TeamDTO;
import com.esports.service.TeamService;

@Controller
@RequestMapping("/team")
public class TeamController {

	private static Logger logger = LoggerFactory.getLogger(TeamController.class);

	@Autowired
	private TeamService teamService;

	@GetMapping
	public String teams(ModelMap model) {
		logger.debug("IN - teams - /");
		logger.debug("getting team list");
		List<TeamDTO> teams = teamService.getTeamList();
		if (teams == null)
			throw new RuntimeException("Equipo no encontrado");

		logger.debug("preparing data for view");
		model.put("teams", teams);
		model.put("view", "team/teams");
		logger.debug("OUT - teams - /");

		return "_t/frame";
	}

	@GetMapping("/detalle")
	public String detail(@RequestParam("id") Long id, ModelMap model) {
		logger.debug("IN - detail - /");
		logger.debug("getting team detail");
		TeamDTO team = teamService.getTeamById(id);

		logger.debug("preparing data for view");
		model.put("team", team);
		model.put("view", "team/team-detail");

		logger.debug("OUT - detail - /");

		return "_t/frame";
	}
}
