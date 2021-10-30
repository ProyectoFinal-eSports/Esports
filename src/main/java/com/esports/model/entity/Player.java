package com.esports.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "players")
public class Player {

	// =======================================

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "name", unique = true)
	private String name;

	@Column(name = "tag")
	private String tag;

	@Transient
	// @ManyToOne(cascade = CascadeType.ALL)
	// @JoinColumn(name = "equipo_id")
	private Team team;

	// =======================================

	public Player() {
		super();
	}

	public Player(Long id) {
		this.id = id;
	}

	public Player(Long id, String name, String tag, Team team) {
		super();
		this.id = id;
		this.name = name;
		this.tag = tag;
		this.team = team;
	}

	public Player(String name, String tag, Team team) {
		super();
		this.name = name;
		this.tag = tag;
		this.team = team;
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

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
