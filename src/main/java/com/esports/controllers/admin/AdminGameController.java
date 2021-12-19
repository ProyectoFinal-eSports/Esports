package com.esports.controllers.admin;

import com.esports.model.Constants;
import com.esports.model.dto.GameDTO;
import com.esports.model.dto.GameFormDTO;
import com.esports.service.GameService;
import com.esports.service.UtilService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin/game")
public class AdminGameController {

	public static final Logger logger = LoggerFactory.getLogger(AdminGameController.class);

	@Autowired
	private GameService gameService;

	@Autowired
	private UtilService utilService;

	@GetMapping("/create")
	public String create(ModelMap model) {
		GameFormDTO gameFormDTO = new GameFormDTO();
		gameFormDTO.setGame(new GameDTO());

		model.put("gameForm", gameFormDTO);
		model.put("view", "admin/game/create");

		return "_t_admin/frame";
	}

	@PostMapping("/create")
	public String createPost(@ModelAttribute GameFormDTO gameForm, ModelMap model, HttpSession session) {
		logger.debug("gameForm: " + gameForm);
		GameDTO gameDTO = gameForm.getGame();
		logger.debug("gameDTO: " + gameDTO);

		String resource = null;
		if (gameForm.getFile() != null)
			resource = utilService.saveResourceFile(gameForm.getFile(),
					Constants.STATIC_FILES_PATH + Constants.IMG_UPLOAD_DIR_GAME);

		if (resource != null) {
			resource = Constants.IMG_UPLOAD_DIR_GAME + resource;
			gameDTO.setImgUrl(resource);
		}

		gameService.saveGame(gameDTO);

		return "redirect:/admin/game/read";
	}

	@GetMapping("/update")
	public String update(@RequestParam("id") Long id, ModelMap model) {
		GameDTO gameDTO = gameService.getGameById(id);
		GameFormDTO gameFormDTO = new GameFormDTO();
		gameFormDTO.setGame(gameDTO);

		model.put("gameForm", gameFormDTO);
		model.put("view", "admin/game/update");

		return "_t_admin/frame";
	}

	@PostMapping("/update")
	public String updatePost(@ModelAttribute GameFormDTO gameForm, ModelMap model, HttpSession session) {
		logger.debug("gameForm: " + gameForm);
		GameDTO gameDTO = gameForm.getGame();
		logger.debug("gameDTO: " + gameDTO);

		String resource = null;
		if (gameForm.getFile() != null)
			resource = utilService.saveResourceFile(gameForm.getFile(),
					Constants.STATIC_FILES_PATH + Constants.IMG_UPLOAD_DIR_GAME);

		if (resource != null) {
			resource = Constants.IMG_UPLOAD_DIR_GAME + resource;
			gameDTO.setImgUrl(resource);
		}

		gameService.updateGame(gameDTO);

		return "redirect:/admin/game/read";
	}

	@GetMapping("/read")
	public String read(ModelMap model) {
		model.put("games", gameService.getGameList());
		model.put("view", "admin/game/read");

		return "_t_admin/frame";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("id") Long id, ModelMap model) {
		gameService.deleteGame(id);

		return "redirect:/admin/game/read";
	}
}
