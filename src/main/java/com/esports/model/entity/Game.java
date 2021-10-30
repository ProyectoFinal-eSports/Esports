package com.esports.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "games")
public class Game {

	// =======================================

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", unique = true)
	private String name;

	@Column(name = "genre")
	private String genre;

	@Column(name = "tag")
	private String tag;

	// =======================================

	public Game() {
		super();
	}

	public Game(Long id) {
		super();
		this.id = id;
	}

	public Game(Long id, String name, String genre, String tag) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.tag = tag;
	}

	public Game(String name, String genre, String tag) {
		super();
		this.name = name;
		this.genre = genre;
		this.tag = tag;
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}
