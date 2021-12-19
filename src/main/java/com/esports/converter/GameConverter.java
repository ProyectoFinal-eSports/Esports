package com.esports.converter;

import org.springframework.stereotype.Component;

import com.esports.model.dto.GameDTO;
import com.esports.model.entity.Game;

@Component
public class GameConverter implements GenericConverter<Game, GameDTO> {

	@Override
	public GameDTO apply(Game input) {

		return input.getId() == null
				? new GameDTO(input.getName(), input.getGenre(), input.getDeveloper(), input.getGameplay(),
						input.getImgUrl(), null)
				: new GameDTO(input.getId(), input.getName(), input.getGenre(), input.getDeveloper(),
						input.getGameplay(), input.getImgUrl(), null);
	}
}
