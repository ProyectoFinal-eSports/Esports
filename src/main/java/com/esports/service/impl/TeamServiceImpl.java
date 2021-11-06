package com.esports.service.impl;

import com.esports.model.entity.Team;
import com.esports.repository.TeamRepository;
import com.esports.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public Team getTeamById(Long id) {
        Optional<Team> team = teamRepository.findById(id);
        if (team.isPresent())
            return team.get();

        return null;
    }
}
