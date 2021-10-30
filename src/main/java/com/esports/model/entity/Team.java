package com.esports.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "teams")
public class Team {

	// =======================================

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", unique = true)
	private String name;

	@Column(name = "tag")
	private String tag;

	@Transient
	// @OneToMany(mappedBy = "jugador", cascade = { CascadeType.PERSIST,
	// CascadeType.MERGE, CascadeType.REFRESH })
	private List<Player> players;

	// =======================================

	public Team() {
		super();
	}

	public Team(Long id) {
		super();
		this.id = id;
	}

	public Team(Long id, String name, String tag, List<Player> players) {
		super();
		this.id = id;
		this.name = name;
		this.tag = tag;
		this.players = players;
	}

	public Team(String name, String tag, List<Player> players) {
		super();
		this.name = name;
		this.tag = tag;
		this.players = players;
	}

	// =======================================

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

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

}
