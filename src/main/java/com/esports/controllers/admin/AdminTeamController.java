package com.esports.controllers.admin;

import com.esports.model.Constants;
import com.esports.model.dto.TeamDTO;
import com.esports.model.dto.TeamFormDTO;
import com.esports.service.TeamService;
import com.esports.service.UtilService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin/team")
public class AdminTeamController {

	public static final Logger logger = LoggerFactory.getLogger(AdminTeamController.class);

	@Autowired
	private TeamService teamService;

	@Autowired
	private UtilService utilService;

	@GetMapping("/create")
	public String create(ModelMap model) {
		TeamFormDTO teamFormDTO = new TeamFormDTO();
		teamFormDTO.setTeam(new TeamDTO());

		model.put("teamForm", teamFormDTO);
		model.put("view", "admin/team/create");

		return "_t_admin/frame";
	}

	@PostMapping("/create")
	public String createPost(@ModelAttribute TeamFormDTO teamForm, ModelMap model, HttpSession session) {
		logger.debug("teamForm: " + teamForm);
		TeamDTO teamDTO = teamForm.getTeam();
		logger.debug("teamDTO: " + teamDTO);

		String resource = null;
		if (teamForm.getFile() != null)
			resource = utilService.saveResourceFile(teamForm.getFile(),
					Constants.STATIC_FILES_PATH + Constants.IMG_UPLOAD_DIR_TEAM);

		if (resource != null) {
			resource = Constants.IMG_UPLOAD_DIR_TEAM + resource;
			teamDTO.setImgUrl(resource);
		}

		teamService.saveTeam(teamDTO);

		return "redirect:/admin/team/read";
	}

	@GetMapping("/update")
	public String update(@RequestParam("id") Long id, ModelMap model) {
		TeamDTO teamDTO = teamService.getTeamById(id);
		TeamFormDTO teamFormDTO = new TeamFormDTO();
		teamFormDTO.setTeam(teamDTO);

		model.put("teamForm", teamFormDTO);
		model.put("view", "admin/team/update");

		return "_t_admin/frame";
	}

	@PostMapping("/update")
	public String updatePost(@ModelAttribute TeamFormDTO teamForm, ModelMap model, HttpSession session) {
		logger.debug("teamForm: " + teamForm);
		TeamDTO teamDTO = teamForm.getTeam();
		logger.debug("teamDTO: " + teamDTO);

		String resource = null;
		if (teamForm.getFile() != null)
			resource = utilService.saveResourceFile(teamForm.getFile(),
					Constants.STATIC_FILES_PATH + Constants.IMG_UPLOAD_DIR_TEAM);

		if (resource != null) {
			resource = Constants.IMG_UPLOAD_DIR_TEAM + resource;
			teamDTO.setImgUrl(resource);
		}

		teamService.updateTeam(teamDTO);

		return "redirect:/admin/team/read";
	}

	@GetMapping("/read")
	public String read(ModelMap model) {
		model.put("teams", teamService.getTeamList());
		model.put("view", "admin/team/read");

		return "_t_admin/frame";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("id") Long id, ModelMap model) {
		teamService.deleteTeam(id);

		return "redirect:/admin/team/read";
	}
}
