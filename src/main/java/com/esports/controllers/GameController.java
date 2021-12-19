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

import com.esports.model.dto.GameDTO;
import com.esports.service.GameService;

@Controller
@RequestMapping("/game")
public class GameController {

	private static Logger logger = LoggerFactory.getLogger(GameController.class);

	@Autowired
	private GameService gameService;

	@GetMapping
	public String games(ModelMap model) {
		logger.debug("IN - games - /");
		logger.debug("getting game list");
		List<GameDTO> games = gameService.getGameList();
		if (games == null)
			throw new RuntimeException("Juego no encontrado");

		logger.debug("preparing data for view");
		model.put("games", games);
		model.put("view", "game/games");
		logger.debug("OUT - games - /");

		return "_t/frame";
	}

	@GetMapping("/detalle")
	public String detail(@RequestParam("id") Long id, ModelMap model) {
		logger.debug("IN - detail - /");
		logger.debug("getting game detail");
		GameDTO game = gameService.getGameById(id);

		logger.debug("preparing data for view");
		model.put("game", game);
		model.put("view", "game/game-detail");

		logger.debug("OUT - detail - /");

		return "_t/frame";
	}

}
