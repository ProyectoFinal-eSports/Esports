package com.esports.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.esports.dto.GameDTO;
import com.esports.dto.PostDTO;
import com.esports.service.GameService;
import com.esports.service.PostService;

@Controller
public class HomeController {

	public static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private PostService postService;

	@Autowired
	private GameService gameService;

	@GetMapping("/")
	public String home(ModelMap model) {
		logger.debug("IN - home - /");
		logger.debug("getting all posts");
		logger.debug("getting all games");
		List<PostDTO> posts = postService.getPostList(true);
		List<GameDTO> games = gameService.getGameList();

		logger.debug("preparing data for view");
		model.put("posts", posts);
		model.put("games", games);
		model.put("view", "/home");

		logger.debug("OUT - home - /");

		return "/_t/frame";
	}

}
