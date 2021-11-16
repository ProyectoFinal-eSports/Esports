package com.esports.converter;

import org.springframework.stereotype.Component;

import com.esports.dto.PlayerDTO;
import com.esports.model.entity.Player;

@Component
public class PlayerDTOConverter implements GenericConverter<PlayerDTO, Player> {

	private final TeamDTOConverter teamDTOConverter;

	public PlayerDTOConverter(TeamDTOConverter teamDTOConverter) {
		super();
		this.teamDTOConverter = teamDTOConverter;
	}

	@Override
	public Player apply(PlayerDTO input) {
		return input.getId() == null
				? new Player(input.getName(), input.getRole(), input.getTags(),
						teamDTOConverter.convert(input.getTeam()))
				: new Player(input.getId(), input.getName(), input.getRole(), input.getTags(),
						teamDTOConverter.convert(input.getTeam()));
	}

}
