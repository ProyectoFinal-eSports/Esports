package com.esports.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "teams")
public class Team {

	// =======================================

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String tags;

	@OneToMany(mappedBy = "team")
	private List<Player> players;

	public Team() {
	}

	public Team(Long id) {
		this.id = id;
	}

	public Team(Long id, String name, String tags, List<Player> players) {
		super();
		this.id = id;
		this.name = name;
		this.tags = tags;
		this.players = players;
	}

	public Team(String name, String tags, List<Player> players) {
		super();
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

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
}
