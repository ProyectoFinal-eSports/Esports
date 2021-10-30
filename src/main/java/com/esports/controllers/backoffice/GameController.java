package com.esports.controllers.backoffice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.esports.service.GameService;

@Controller
public class GameController {

	@Autowired
	GameService gameService;
	
	
}
