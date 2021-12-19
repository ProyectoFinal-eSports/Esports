package com.esports.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {

	// =======================================

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@OneToMany(mappedBy = "role")
	private List<Player> players;

	// =======================================

	public Role() {
	}

	public Role(Long id) {
		this.id = id;
	}

	public Role(Long id, String name, List<Player> players) {
		super();
		this.id = id;
		this.name = name;
		this.players = players;
	}

	public Role(String name, List<Player> players) {
		super();
		this.name = name;
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

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

}
