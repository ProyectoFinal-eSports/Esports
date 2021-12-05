package com.esports.model.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tournaments")
public class Tournament {

	// =======================================

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	private String name;

	private String region;

	@Column(name = "img_url")
	private String imgUrl;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "game_id")
	private Game game;

	@ManyToMany(mappedBy = "tournaments", fetch = FetchType.LAZY)
	private Set<Team> teams = new HashSet<>();

	public Tournament() {
		super();
	}

	public Tournament(Long id) {
		super();
		this.id = id;
	}

	public Tournament(Long id, String name, String region, String imgUrl, Game game) {
		super();
		this.id = id;
		this.name = name;
		this.region = region;
		this.imgUrl = imgUrl;
		this.game = game;
	}

	public Tournament(String name, String region, String imgUrl, Game game) {
		super();
		this.name = name;
		this.region = region;
		this.imgUrl = imgUrl;
		this.game = game;
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Set<Team> getTeams() {
		return teams;
	}

	public void setTeams(Set<Team> teams) {
		this.teams = teams;
	}

}
