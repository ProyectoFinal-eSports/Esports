package com.esports.converter;

import org.springframework.stereotype.Component;

import com.esports.model.dto.PlayerDTO;
import com.esports.model.entity.Player;

@Component
public class PlayerConverter implements GenericConverter<Player, PlayerDTO> {

	private final RoleConverter roleConverter;

	private final TeamConverter teamConverter;

	public PlayerConverter(RoleConverter roleConverter, TeamConverter teamConverter) {
		super();
		this.roleConverter = roleConverter;
		this.teamConverter = teamConverter;
	}

	@Override
	public PlayerDTO apply(Player input) {
		return input.getId() == null
				? new PlayerDTO(input.getPlayerName(), input.getName(), roleConverter.convert(input.getRole()),
						input.getTags(), teamConverter.convert(input.getTeam()))
				: new PlayerDTO(input.getId(), input.getPlayerName(), input.getName(),
						roleConverter.convert(input.getRole()), input.getTags(),
						teamConverter.convert(input.getTeam()));
	}

}
