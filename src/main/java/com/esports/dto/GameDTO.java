package com.esports.dto;

import java.util.List;

public class GameDTO {

	private Long id;
	private String name;
	private String genre;
	private String gameplay;
	private String imgUrl;
	private List<TournamentDTO> tournaments;

	public GameDTO() {
	}

	public GameDTO(Long id, String name, String genre, String gameplay, String imgUrl,
			List<TournamentDTO> tournaments) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.gameplay = gameplay;
		this.imgUrl = imgUrl;
		this.tournaments = tournaments;
	}

	public GameDTO(String name, String genre, String gameplay, String imgUrl, List<TournamentDTO> tournaments) {
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

	public List<TournamentDTO> getTournaments() {
		return tournaments;
	}

	public void setTournaments(List<TournamentDTO> tournaments) {
		this.tournaments = tournaments;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GameDTO [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", genre=");
		builder.append(genre);
		builder.append(", gameplay=");
		builder.append(gameplay);
		builder.append(", imgUrl=");
		builder.append(imgUrl);
		builder.append(", tournaments=");
		builder.append(tournaments);
		builder.append("]");
		return builder.toString();
	}

}
