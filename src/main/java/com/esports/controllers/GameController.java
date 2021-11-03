package com.esports.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.esports.dto.GameDTO;
import com.esports.service.GameService;

@Controller
@RequestMapping("/game")
public class GameController {

	@Autowired
	private GameService gameService;

	@GetMapping
	public String games(ModelMap model) {
		List<GameDTO> games = gameService.getGameList();
		model.put("games", games);
		model.put("view", "/game/games");
		return "/_t/frame";
	}

	@GetMapping("/detalle")
	public String detail(@RequestParam("id") Long id, ModelMap model) {
		GameDTO game = gameService.getGame(id);
		model.put("game", game);
		model.put("view", "/game/game-detail");
		return "/_t/frame";
	}

}
