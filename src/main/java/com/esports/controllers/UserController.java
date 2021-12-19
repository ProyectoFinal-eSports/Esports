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

import com.esports.model.Constants;
import com.esports.model.SecurityRole;
import com.esports.model.dto.UserDTO;
import com.esports.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	public static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	private String message = "";

	@GetMapping("/registro")
	public String registro(ModelMap model, HttpSession session) {

		model.put("userDTO", new UserDTO());
		model.put("view", "user/registro");

		return "_t/frame";
	}

	@PostMapping("/registro")
	public String registro(@ModelAttribute UserDTO userDTO, ModelMap model, HttpSession session) {
		logger.info("userDTO: " + userDTO);
		if (userDTO.getAdmin())
			userDTO.setSecurityRole(SecurityRole.ADMIN);

		userDTO = userService.createUser(userDTO);

		model.put("userDTO", userDTO);
		model.put("message", "Usuario registrado");
		model.put("view", "user/registro");

		return "_t/frame";
	}

	@GetMapping("/login")
	public String loginForm(ModelMap model, HttpSession session) {
		if (session.getAttribute(Constants.USER_SESSION) != null)
			return "redirect:/";

		model.put("userDTO", new UserDTO());
		model.put("view", "user/login");

		return "_t/frame";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute UserDTO user, ModelMap model, HttpSession session) {
		logger.debug(user.getLoginname() + " / " + user.getPassword());

		UserDTO userData = userService.authUser(user.getLoginname(), user.getPassword());

		if (userData != null) {
			message = "";
			session.setAttribute(Constants.USER_SESSION, userData);

			if (userData.getSecurityRole() == SecurityRole.ADMIN)
				return "redirect:/admin/home";

			return "redirect:/";
		}

		message = "Usuario o Password incorrecto. Pruebe de nuevo !";
		model.put("user", user);
		model.put("message", message);
		model.put("view", "user/login");

		return "_t/frame";
	}

	@GetMapping("/logout")
	public String logout(ModelMap model, HttpSession session) {
		logger.debug("IN - logout");

		if (session.getAttribute(Constants.USER_SESSION) != null)
			session.removeAttribute(Constants.USER_SESSION);

		logger.debug("OUT - logout");

		return "redirect:/";
	}

}
