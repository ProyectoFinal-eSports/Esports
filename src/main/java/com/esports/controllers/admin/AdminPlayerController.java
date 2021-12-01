package com.esports.controllers.admin;

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

import com.esports.dto.PlayerDTO;
import com.esports.dto.PlayerFormDTO;
import com.esports.dto.TeamDTO;
import com.esports.service.PlayerService;
import com.esports.service.TeamService;

@Controller
@RequestMapping("/admin")
public class AdminPlayerController {

	public static final Logger logger = LoggerFactory.getLogger(AdminPlayerController.class);

	@Autowired
	private PlayerService playerService;

	@Autowired
	private TeamService teamService;

	private String message = "";

	@GetMapping("player/create")
	public String playerCreate(ModelMap model) {
		PlayerFormDTO playerFormDTO = new PlayerFormDTO();
		playerFormDTO.setTeams(teamService.getTeamList());
		model.put("playerForm", playerFormDTO);
		model.put("view", "admin/player/create");
		return "/_t/frame";
	}

	@PostMapping("player/create")
	public String playerCreatePost(@ModelAttribute PlayerFormDTO playerForm, ModelMap model, HttpSession session) {
		logger.debug("PlayerFormDTO: " + playerForm);
		
		TeamDTO teamDTO = new TeamDTO();
		teamDTO.setId(Long.parseLong(playerForm.getTeamSelected()));
		PlayerDTO playerDTO = playerForm.getPlayer();
		playerDTO.setTeam(teamDTO);		
		playerService.savePlayer(playerDTO);
		
		return "redirect:/admin/player/create";
	}

	@GetMapping("player/read")
	public String teamRead(ModelMap model) {
		model.put("players", playerService.getPlayerList());
		model.put("view", "admin/player/read");
		return "/_t/frame";
	}

}
