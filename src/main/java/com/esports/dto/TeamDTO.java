package com.esports.dto;

import java.util.List;

public class TeamDTO {

	private Long id;
	private String name;
	private String tags;
	private List<PlayerDTO> players;

	public TeamDTO() {
	}

	public TeamDTO(String name, String tags, List<PlayerDTO> players) {
		super();
		this.name = name;
		this.tags = tags;
		this.players = players;
	}

	public TeamDTO(Long id, String name, String tags, List<PlayerDTO> players) {
		super();
		this.id = id;
		this.name = name;
		this.tags = tags;
		this.players = players;
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

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public List<PlayerDTO> getPlayers() {
		return players;
	}

	public void setPlayers(List<PlayerDTO> players) {
		this.players = players;
	}

}
