package com.esports.dto;

import java.util.List;

public class RoleDTO {

	private Long id;
	private String name;
	private List<PlayerDTO> players;

	public RoleDTO() {
	}

	public RoleDTO(String name, List<PlayerDTO> players) {
		super();
		this.name = name;
		this.players = players;
	}

	public RoleDTO(Long id, String name, List<PlayerDTO> players) {
		super();
		this.id = id;
		this.name = name;
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

	public List<PlayerDTO> getPlayers() {
		return players;
	}

	public void setPlayers(List<PlayerDTO> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RoleDTO [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", players=");
		builder.append(players);
		builder.append("]");
		return builder.toString();
	}

}
