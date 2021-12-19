package com.esports.controllers;

import java.util.List;

import com.esports.model.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.esports.model.dto.GameDTO;
import com.esports.model.dto.PostDTO;
import com.esports.service.GameService;
import com.esports.service.PostService;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

	public static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private PostService postService;

	@Autowired
	private GameService gameService;

	@GetMapping(value = { "/", "/home" })
	public String home(ModelMap model, HttpSession session) {
		logger.debug("IN - home - /");
		logger.debug("getting all posts");
		logger.debug("getting all games");

		boolean registrado = session.getAttribute(Constants.USER_SESSION) != null;
		List<PostDTO> posts = postService.getLatestPosts(registrado);
		List<GameDTO> games = gameService.getGameList();

		logger.debug("preparing data for view");
		model.put("posts", posts);
		model.put("games", games);
		model.put("view", "home");

		logger.debug("OUT - home - /");

		return "_t/frame";
	}

	@GetMapping("/info")
	public String info(ModelMap model, HttpSession session) {
		model.put("msg", session.getAttribute("_mensaje"));
		model.put("link", session.getAttribute("_link"));
		model.put("severity", "info");
		model.put("view", "info");

		return "_t/frame";
	}

}
