package com.esports.converter;

import org.springframework.stereotype.Component;

import com.esports.model.dto.TournamentDTO;
import com.esports.model.entity.Tournament;

@Component
public class TournamentDTOConverter implements GenericConverter<TournamentDTO, Tournament> {

	private final GameDTOConverter gameDTOConverter;

	public TournamentDTOConverter(GameDTOConverter gameDTOConverter) {
		super();
		this.gameDTOConverter = gameDTOConverter;
	}

	@Override
	public Tournament apply(TournamentDTO input) {

		return input.getId() == null
				? new Tournament(input.getName(), input.getRegion(), gameDTOConverter.convert(input.getGame()))
				: new Tournament(input.getId(), input.getName(), input.getRegion(),
						gameDTOConverter.convert(input.getGame()));
	}

}
