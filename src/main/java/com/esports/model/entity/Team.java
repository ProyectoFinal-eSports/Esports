package com.esports.model.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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

	@Column(columnDefinition = "TEXT")
	private String history;

	@Column(name = "img_url")
	private String imgUrl;

	@OneToMany(mappedBy = "team")
	private List<Player> players;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE, CascadeType.REFRESH })
	@JoinTable(name = "teams_tournaments", joinColumns = {
			@JoinColumn(name = "team_id", referencedColumnName = "id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "tournament_id", referencedColumnName = "id", nullable = false, updatable = false) })
	private Set<Tournament> tournaments = new HashSet<>();

	// =======================================

	public Team() {
	}

	public Team(Long id) {
		this.id = id;
	}

	public Team(Long id, String name, String history, String imgUrl, List<Player> players) {
		super();
		this.id = id;
		this.name = name;
		this.history = history;
		this.imgUrl = imgUrl;
		this.players = players;
	}

	public Team(String name, String history, String imgUrl, List<Player> players) {
		super();
		this.name = name;
		this.history = history;
		this.imgUrl = imgUrl;
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

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public Set<Tournament> getTournaments() {
		return tournaments;
	}

	public void setTournaments(Set<Tournament> tournaments) {
		this.tournaments = tournaments;
	}

}
