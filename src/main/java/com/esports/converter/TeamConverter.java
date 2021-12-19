package com.esports.converter;

import org.springframework.stereotype.Component;

import com.esports.model.dto.TeamDTO;
import com.esports.model.entity.Team;

@Component
public class TeamConverter implements GenericConverter<Team, TeamDTO> {

	@Override
	public TeamDTO apply(Team input) {
		
		return input.getId() == null 
				? new TeamDTO(input.getName(),input.getHistory(), input.getImgUrl(), null)
				: new TeamDTO(input.getId(), input.getName(),input.getHistory(),input.getImgUrl(), null);
	}

}
