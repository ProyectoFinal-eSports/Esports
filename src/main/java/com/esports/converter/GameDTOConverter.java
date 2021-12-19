package com.esports.converter;

import org.springframework.stereotype.Component;

import com.esports.model.dto.GameDTO;
import com.esports.model.entity.Game;

@Component
public class GameDTOConverter implements GenericConverter<GameDTO, Game> {

	@Override
	public Game apply(GameDTO input) {

		return input.getId() == null
				? new Game(input.getName(), input.getGenre(), input.getDeveloper(),input.getGameplay(), input.getImgUrl(), null)
				: new Game(input.getId(), input.getName(), input.getGenre(), input.getDeveloper(),input.getGameplay(), input.getImgUrl(), null);
	}

}
