package com.esports.converter;

import org.springframework.stereotype.Component;

import com.esports.model.dto.PlayerDTO;
import com.esports.model.entity.Player;

@Component
public class PlayerDTOConverter implements GenericConverter<PlayerDTO, Player> {

	private final RoleDTOConverter roleDTOConverter;

	private final TeamDTOConverter teamDTOConverter;

	public PlayerDTOConverter(RoleDTOConverter roleDTOConverter, TeamDTOConverter teamDTOConverter) {
		super();
		this.roleDTOConverter = roleDTOConverter;
		this.teamDTOConverter = teamDTOConverter;
	}

	@Override
	public Player apply(PlayerDTO input) {
		return input.getId() == null
				? new Player(input.getPlayerName(), input.getName(), roleDTOConverter.convert(input.getRole()), input.getTags(),
						teamDTOConverter.convert(input.getTeam()))
				: new Player(input.getId(), input.getPlayerName(), input.getName(), roleDTOConverter.convert(input.getRole()), input.getTags(),
						teamDTOConverter.convert(input.getTeam()));
	}

}
