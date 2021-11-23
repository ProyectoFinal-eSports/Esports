package com.esports.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "games")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	private String name;

	private String genre;

	private String gameplay;

	@Column(name = "img_url")
	private String imgUrl;

	@OneToMany(mappedBy = "game")
	private List<Tournament> tournaments;

	public Game() {
		super();
	}

	public Game(Long id) {
		this.id = id;
	}

	public Game(Long id, String name, String genre, String gameplay, String imgUrl, List<Tournament> tournaments) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.gameplay = gameplay;
		this.imgUrl = imgUrl;
		this.tournaments = tournaments;
	}

	public Game(String name, String genre, String gameplay, String imgUrl, List<Tournament> tournaments) {
		super();
		this.name = name;
		this.genre = genre;
		this.gameplay = gameplay;
		this.imgUrl = imgUrl;
		this.tournaments = tournaments;
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getGameplay() {
		return gameplay;
	}

	public void setGameplay(String gameplay) {
		this.gameplay = gameplay;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public List<Tournament> getTournaments() {
		return tournaments;
	}

	public void setTournaments(List<Tournament> tournaments) {
		this.tournaments = tournaments;
	}

}
