package com.esports.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player {

	// =======================================

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true, name = "player_name")
	private String playerName;

	private String name;

	private String role;

	private String tags;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "team_id")
	private Team team;

	public Player() {
		super();
	}

	public Player(Long id) {
		super();
		this.id = id;
	}

	public Player(String playerName, String name, String role, String tags, Team team) {
		super();
		this.playerName = playerName;
		this.name = name;
		this.role = role;
		this.tags = tags;
		this.team = team;
	}

	public Player(Long id, String playerName, String name, String role, String tags, Team team) {
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

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
