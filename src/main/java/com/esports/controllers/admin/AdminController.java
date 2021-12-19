package com.esports.controllers.admin;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esports.model.Constants;
import com.esports.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	public static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	@Autowired
	private UserService userService;

	private String message = "";

	@GetMapping(value = { "", "/home" })
	public String home(ModelMap model, HttpSession session) {
		logger.debug("IN - admin home");

		message = "";

		if (session.getAttribute(Constants.USER_SESSION) == null)
			return "redirect:/admin/login";

		model.put("view", "admin/home");

		logger.debug("OUT - admin home");

		return "_t_admin/frame";
	}
}
