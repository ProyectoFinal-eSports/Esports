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

import com.esports.model.dto.PlayerDTO;
import com.esports.model.dto.PlayerFormDTO;
import com.esports.model.dto.RoleDTO;
import com.esports.model.dto.TeamDTO;
import com.esports.service.PlayerService;
import com.esports.service.RoleService;
import com.esports.service.TeamService;

@Controller
@RequestMapping("/admin/player")
public class AdminPlayerController {

	public static final Logger logger = LoggerFactory.getLogger(AdminPlayerController.class);

	@Autowired
	private PlayerService playerService;

	@Autowired
	private RoleService roleService;

	@Autowired
	private TeamService teamService;

	@GetMapping("/create")
	public String playerCreate(ModelMap model) {
		PlayerFormDTO playerFormDTO = new PlayerFormDTO();
		playerFormDTO.setTeams(teamService.getTeamList());
		playerFormDTO.setRoles(roleService.getRoleList());
		model.put("playerForm", playerFormDTO);
		model.put("view", "admin/player/create");

		return "_t_admin/frame";
	}

	@PostMapping("/create")
	public String playerCreatePost(@ModelAttribute PlayerFormDTO playerForm, ModelMap model, HttpSession session) {
		logger.debug("PlayerFormDTO: " + playerForm);

		TeamDTO teamDTO = new TeamDTO();
		teamDTO.setId(Long.parseLong(playerForm.getTeamSelected()));
		RoleDTO roleDTO = new RoleDTO();
		roleDTO.setId(Long.parseLong(playerForm.getRoleSelected()));
		PlayerDTO playerDTO = playerForm.getPlayer();
		playerDTO.setTeam(teamDTO);
		playerDTO.setRole(roleDTO);
		playerService.savePlayer(playerDTO);

		return "redirect:/admin/player/read";
	}

	@GetMapping("/read")
	public String teamRead(ModelMap model) {
		model.put("players", playerService.getPlayerList());
		model.put("view", "admin/player/read");

		return "_t_admin/frame";
	}
}
