package com.esports.model.dto;

import java.util.List;

public class PlayerFormDTO {

	private PlayerDTO player;
	private List<TeamDTO> teams;
	private String teamSelected;
	private List<RoleDTO> roles;
	private String roleSelected;

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

	public List<RoleDTO> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleDTO> roles) {
		this.roles = roles;
	}

	public String getRoleSelected() {
		return roleSelected;
	}

	public void setRoleSelected(String roleSelected) {
		this.roleSelected = roleSelected;
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
		builder.append(", roles=");
		builder.append(roles);
		builder.append(", roleSelected=");
		builder.append(roleSelected);
		builder.append("]");
		return builder.toString();
	}

}
