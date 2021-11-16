package com.esports.converter;

import org.springframework.stereotype.Component;

import com.esports.dto.PlayerDTO;
import com.esports.model.entity.Player;

@Component
public class PlayerConverter implements GenericConverter<Player, PlayerDTO> {

	private final TeamConverter teamConverter;

	public PlayerConverter(TeamConverter teamConverter) {
		super();
		this.teamConverter = teamConverter;
	}

	@Override
	public PlayerDTO apply(Player input) {
		return input.getId() == null
				? new PlayerDTO(input.getName(), input.getRole(), input.getTags(),
						teamConverter.convert(input.getTeam()))
				: new PlayerDTO(input.getId(), input.getName(), input.getRole(), input.getTags(),
						teamConverter.convert(input.getTeam()));
	}

}
