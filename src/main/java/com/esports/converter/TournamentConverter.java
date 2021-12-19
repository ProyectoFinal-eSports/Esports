package com.esports.converter;

import org.springframework.stereotype.Component;

import com.esports.model.dto.TournamentDTO;
import com.esports.model.entity.Tournament;

@Component
public class TournamentConverter implements GenericConverter<Tournament, TournamentDTO> {

	private final GameConverter gameConverter;

	public TournamentConverter(GameConverter gameConverter) {
		super();
		this.gameConverter = gameConverter;
	}

	@Override
	public TournamentDTO apply(Tournament input) {

		return input.getId() == null
				? new TournamentDTO(input.getName(), input.getRegion(), gameConverter.convert(input.getGame()))
				: new TournamentDTO(input.getId(), input.getName(), input.getRegion(),
						gameConverter.convert(input.getGame()));
	}

}
