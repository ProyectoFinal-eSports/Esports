package com.esports.controllers;

import com.esports.model.entity.Team;
import com.esports.service.TeamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/team")
public class TeamController {

    private static Logger logger = LoggerFactory.getLogger(TeamController.class);

    @Autowired
    private TeamService teamService;

    @GetMapping
    public String getTeam(@RequestParam Long id, Model model) {
       Team team = teamService.getTeamById(id);
       if (team == null)
           throw new RuntimeException("Equipo no encontrado");

        model.addAttribute("team", team);
        model.addAttribute("view", "/team");

        return "/_t/frame";
    }
}
