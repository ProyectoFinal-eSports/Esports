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

import com.esports.model.dto.PlayerDTO;
import com.esports.service.PlayerService;

@Controller
@RequestMapping("/player")
public class PlayerController {

	private static Logger logger = LoggerFactory.getLogger(PlayerController.class);

	@Autowired
	private PlayerService playerService;

	@GetMapping
	public String players(ModelMap model) {
		logger.debug("IN - players - /");
		logger.debug("getting player list");
		List<PlayerDTO> players = playerService.getPlayerList();

		logger.debug("preparing data for view");
		model.put("players", players);
		model.put("view", "player/players");

		return "_t/frame";
	}

	@GetMapping("/detalle")
	public String detail(@RequestParam Long id, ModelMap model) {
		logger.debug("IN - detail - /");
		logger.debug("getting player detail");
		PlayerDTO player = playerService.getPlayerById(id);

		logger.debug("preparing data for view");
		model.put("player", player);
		model.put("view", "player/player-detail");

		logger.debug("OUT - detail - /");

		return "_t/frame";

	}
}