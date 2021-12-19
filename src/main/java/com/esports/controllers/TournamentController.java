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

import com.esports.model.dto.TournamentDTO;
import com.esports.service.TournamentService;

@Controller
@RequestMapping("/tournament")
public class TournamentController {

	private static Logger logger = LoggerFactory.getLogger(TournamentController.class);

	@Autowired
	private TournamentService tournamentService;

	@GetMapping
	public String tournaments(ModelMap model) {
		logger.debug("IN - tournaments - /");
		logger.debug("getting tournament list");
		List<TournamentDTO> tournaments = tournamentService.getTournamentList();

		logger.debug("preparing data for view");
		model.put("tournaments", tournaments);
		model.put("view", "tournament/tournaments");

		return "_t/frame";
	}

	@GetMapping("/detalle")
	public String detail(@RequestParam Long id, ModelMap model) {
		logger.debug("IN - detail - /");
		logger.debug("getting tournament detail");
		TournamentDTO tournament = tournamentService.getTournamentById(id);

		logger.debug("preparing data for view");
		model.put("tournament", tournament);
		model.put("view", "tournament/tournament-detail");

		logger.debug("OUT - detail - /");

		return "_t/frame";
	}
}
