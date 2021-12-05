package com.esports.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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

	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;

	private String tags;

	@ManyToOne
	@JoinColumn(name = "team_id")
	private Team team;

	// =======================================

	public Player() {
		super();
	}

	public Player(Long id) {
		super();
		this.id = id;
	}

	public Player(Long id, String playerName, String name, Role role, String tags, Team team) {
		super();
		this.id = id;
		this.playerName = playerName;
		this.name = name;
		this.role = role;
		this.tags = tags;
		this.team = team;
	}

	public Player(String playerName, String name, Role role, String tags, Team team) {
		super();
		this.playerName = playerName;
		this.name = name;
		this.role = role;
		this.tags = tags;
		this.team = team;
	}

	// =======================================

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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
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
