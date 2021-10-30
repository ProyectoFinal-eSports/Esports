package com.esports.controllers.backoffice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home(ModelMap model) {

		String vista = "/home";
		model.put("view", vista);
		return "/_t/frame";
	}

}
