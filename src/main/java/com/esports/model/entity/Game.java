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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	private String name;

	private String genre;

	private String tags;
	
	private String imgUrl;

	/*
	 * @ManyToOne(cascade = CascadeType.ALL) private List<Championship>
	 * championships;
	 */

	// =======================================

	public Game() {
	}

	public Game(Long id) {
		super();
		this.id = id;
	}

	public Game(Long id, String name, String genre, String tags) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.tags = tags;
	}

	public Game(String name, String genre, String tags) {
		super();
		this.name = name;
		this.genre = genre;
		this.tags = tags;
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

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

}
