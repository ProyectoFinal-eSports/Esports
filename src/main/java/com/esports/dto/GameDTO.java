package com.esports.dto;

public class GameDTO {

	private Long id;

	private String name;

	private String genre;

	private String tag;

	public GameDTO() {
		super();
	}

	public GameDTO(String name, String genre, String tag) {
		super();
		this.name = name;
		this.genre = genre;
		this.tag = tag;
	}

	public GameDTO(Long id, String name, String genre, String tag) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.tag = tag;
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

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}
