package com.esports.converter;

import org.springframework.stereotype.Component;

import com.esports.dto.TeamDTO;
import com.esports.model.entity.Team;

@Component
public class TeamDTOConverter implements GenericConverter<TeamDTO, Team> {

	@Override
	public Team apply(TeamDTO input) {
		return input.getId() == null
				? new Team(input.getName(), input.getTags(), null)
				: new Team(input.getId(), input.getName(), input.getTags(), null);
	}

}
