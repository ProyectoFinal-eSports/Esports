package com.esports.controllers.admin;

import com.esports.model.dto.GameDTO;
import com.esports.model.dto.TournamentDTO;
import com.esports.model.dto.TournamentFormDTO;
import com.esports.model.entity.Game;
import com.esports.service.GameService;
import com.esports.service.TournamentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin/tournament")
public class AdminTournamentController {

	public static final Logger logger = LoggerFactory.getLogger(AdminTournamentController.class);

	@Autowired
	private TournamentService tournamentService;

	@Autowired
	private GameService gameService;

	@GetMapping("/create")
	public String create(ModelMap model) {
		List<GameDTO> games = gameService.getGameList();
		TournamentFormDTO tournamentForm = new TournamentFormDTO();
		tournamentForm.setGames(games);
		TournamentDTO tournamentDTO = new TournamentDTO();
		tournamentForm.setTournament(tournamentDTO);

		model.put("tournamentForm", tournamentForm);
		model.put("view", "admin/tournament/create");

		return "_t_admin/frame";
	}

	@PostMapping("/create")
	public String createPost(@ModelAttribute TournamentFormDTO tournamentForm, ModelMap model, HttpSession session) {
		TournamentDTO tournamentDTO = tournamentForm.getTournament();
		tournamentDTO.setGame(new GameDTO(Long.parseLong(tournamentForm.getGameSelected())));

		logger.debug("tournamentDTO: " + tournamentDTO);
		tournamentService.saveTournament(tournamentDTO);

		return "redirect:/admin/tournament/read";
	}

	@GetMapping("/update")
	public String update(@RequestParam("id") Long id, ModelMap model) {
		List<GameDTO> games = gameService.getGameList();
		TournamentDTO tournamentDTO=tournamentService.getTournamentById(id);
		TournamentFormDTO tournamentForm = new TournamentFormDTO();
		tournamentForm.setTournament(tournamentDTO);
		tournamentForm.setGameSelected(tournamentDTO.getGame().getId().toString());
		tournamentForm.setGames(games);

		model.put("tournamentForm", tournamentForm);
		model.put("view", "admin/tournament/update");

		return "_t_admin/frame";
	}

	@PostMapping("/update")
	public String updatePost(@ModelAttribute TournamentFormDTO tournamentForm, ModelMap model, HttpSession session) {
		TournamentDTO tournamentDTO = tournamentForm.getTournament();
		tournamentDTO.setGame(new GameDTO(Long.parseLong(tournamentForm.getGameSelected())));
		logger.debug("tournamentDTO: " + tournamentDTO);

		tournamentService.updateTournament(tournamentDTO);

		return "redirect:/admin/tournament/read";
	}

	@GetMapping("/read")
	public String read(ModelMap model) {
		model.put("tournaments", tournamentService.getTournamentList());
		model.put("view", "admin/tournament/read");

		return "_t_admin/frame";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("id") Long id, ModelMap model) {
		tournamentService.deleteTournament(id);

		return "redirect:/admin/tournament/read";
	}
}
