package com.esports.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.esports.dto.PostDTO;
import com.esports.service.PostService;

@Controller
@RequestMapping("/post")
public class PostController {

	public static final Logger logger = LoggerFactory.getLogger(PostController.class);

	@Autowired
	private PostService postService;

	@GetMapping
	public String posts(ModelMap model, HttpSession session) {
		logger.debug("IN - posts - /");
		logger.debug("getting post list");
		boolean registrado = session.getAttribute("User") != null;
		List<PostDTO> posts = postService.getPostList(registrado);

		logger.debug("preparing data for view");
		model.put("posts", posts);
		model.put("view", "/post/posts");

		logger.debug("OUT - posts - /");

		return "/_t/frame";
	}

	@GetMapping("/detalle")
	public String detail(@RequestParam("id") Long id, ModelMap model) {
		logger.debug("IN - detail - /");
		logger.debug("getting post detail");
		PostDTO post = postService.getPostById(id);

		logger.debug("preparing data for view");
		model.put("post", post);
		model.put("view", "/post/post-detail");

		logger.debug("OUT - detail - /");

		return "/_t/frame";
	}
}
