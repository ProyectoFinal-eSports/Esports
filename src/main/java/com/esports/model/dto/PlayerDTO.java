package com.esports.model.dto;

public class PlayerDTO {

	private Long id;
	private String playerName;
	private String name;
	private RoleDTO role;
	private String tags;
	private TeamDTO team;

	public PlayerDTO() {
	}

	public PlayerDTO(String playerName, String name, RoleDTO role, String tags, TeamDTO team) {
		super();
		this.playerName = playerName;
		this.name = name;
		this.role = role;
		this.tags = tags;
		this.team = team;
	}

	public PlayerDTO(Long id, String playerName, String name, RoleDTO role, String tags, TeamDTO team) {
		super();
		this.id = id;
		this.playerName = playerName;
		this.name = name;
		this.role = role;
		this.tags = tags;
		this.team = team;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RoleDTO getRole() {
		return role;
	}

	public void setRole(RoleDTO role) {
		this.role = role;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public TeamDTO getTeam() {
		return team;
	}

	public void setTeam(TeamDTO team) {
		this.team = team;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlayerDTO [id=");
		builder.append(id);
		builder.append(", playerName=");
		builder.append(playerName);
		builder.append(", name=");
		builder.append(name);
		builder.append(", role=");
		builder.append(role);
		builder.append(", tags=");
		builder.append(tags);
		builder.append(", team=");
		builder.append(team);
		builder.append("]");
		return builder.toString();
	}

}
