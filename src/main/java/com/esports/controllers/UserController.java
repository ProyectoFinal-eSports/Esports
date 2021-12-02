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
		model.put("view", "/user/registro");

		return "/_t/frame";
	}

	@PostMapping("/registro")
	public String registro(@ModelAttribute UserDTO userDTO, ModelMap model, HttpSession session) {

		logger.info("userDTO: " + userDTO);

		userDTO = userService.createUser(userDTO);

		model.put("userDTO", userDTO);
		model.put("view", "/user/registro");
		model.put("message", "Usuario registrado");
		// Redirecionar a la pantalla de registro
		return "/_t/frame";
	}

	@GetMapping("/login")
	public String loginForm(ModelMap model, HttpSession session) {
		model.put("view", "/user/login");
		return "/_t/frame";
	}

}
