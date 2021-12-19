package com.esports.model.dto;

import java.util.List;

public class TournamentFormDTO {

	private TournamentDTO tournament;
	private List<GameDTO> games;
	private String gameSelected;

	public TournamentDTO getTournament() {
		return tournament;
	}

	public void setTournament(TournamentDTO tournament) {
		this.tournament = tournament;
	}

	public List<GameDTO> getGames() {
		return games;
	}

	public void setGames(List<GameDTO> games) {
		this.games = games;
	}

	public String getGameSelected() {
		return gameSelected;
	}

	public void setGameSelected(String gameSelected) {
		this.gameSelected = gameSelected;
	}
}
