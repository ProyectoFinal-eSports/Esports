package com.esports.controllers;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esports.dto.UserDTO;
import com.esports.model.entity.User;
import com.esports.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	public static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	@Autowired
	private UserService userService;

	private String message = "";

	@GetMapping("/home")
	public String home(ModelMap model, HttpSession session) {
		logger.debug("IN - admin home");

		message = "";

		if (session.getAttribute("user") == null)
			return "redirect:/admin/login";

		model.put("view", "/admin/home");

		logger.debug("OUT - admin home");
		return "/_t/frame";
	}

	@GetMapping("/login")
	public String loginForm(ModelMap model, HttpSession session) {
		logger.debug("IN - loginForm");

		model.put("user", new UserDTO());
		model.put("view", "/admin/login");

		logger.debug("OUT - loginForm");
		return "/_t/frame";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute UserDTO user, ModelMap model, HttpSession session) {
		logger.debug("IN - login");

		logger.debug(user.getLoginname() + " / " + user.getPassword());

		User userData = userService.authUser(user.getLoginname(), user.getPassword());

		if (userData != null) {
			message = "";
			session.setAttribute("user", userData);
			return "redirect:/admin/home";
		}

		message = "Usuario o Password incorrecto. Pruebe de nuevo !";
		model.put("user", user);
		model.put("view", "/admin/login");
		model.put("message", message);

		logger.debug("OUT - login");
		return "/_t/frame";
	}

	@GetMapping("/logout")
	public String logout(ModelMap model, HttpSession session) {
		logger.debug("IN - logout");

		if (session.getAttribute("user") != null)
			session.removeAttribute("user");

		logger.debug("OUT - logout");

		return "redirect:/admin/login";
	}

}
