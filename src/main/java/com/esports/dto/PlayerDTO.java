package com.esports.dto;

public class PlayerDTO {

	private Long id;

	private String name;

	private String role;

	private String tags;

	private TeamDTO team;

	public PlayerDTO() {
	}

	public PlayerDTO(String name, String role, String tags, TeamDTO team) {
		super();
		this.name = name;
		this.role = role;
		this.tags = tags;
		this.team = team;
	}

	public PlayerDTO(Long id, String name, String role, String tags, TeamDTO team) {
		super();
		this.id = id;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
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

}
