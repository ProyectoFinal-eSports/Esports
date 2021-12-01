package com.esports.dto;

import java.util.List;

public class PlayerFormDTO {

	private PlayerDTO player;
	private List<TeamDTO> teams;
	private String teamSelected;

	public PlayerDTO getPlayer() {
		return player;
	}

	public void setPlayer(PlayerDTO player) {
		this.player = player;
	}

	public List<TeamDTO> getTeams() {
		return teams;
	}

	public void setTeams(List<TeamDTO> teams) {
		this.teams = teams;
	}

	public String getTeamSelected() {
		return teamSelected;
	}

	public void setTeamSelected(String teamSelected) {
		this.teamSelected = teamSelected;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlayerFormDTO [player=");
		builder.append(player);
		builder.append(", teams=");
		builder.append(teams);
		builder.append(", teamSelected=");
		builder.append(teamSelected);
		builder.append("]");
		return builder.toString();
	}
}
