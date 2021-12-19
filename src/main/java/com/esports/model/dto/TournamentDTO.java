package com.esports.model.dto;

public class TournamentDTO {

	private Long id;
	private String name;
	private String region;
	private GameDTO game;

	public TournamentDTO() {
	}

	public TournamentDTO(String name, String region, GameDTO game) {
		super();
		this.name = name;
		this.region = region;
		this.game = game;
	}

	public TournamentDTO(Long id, String name, String region, GameDTO game) {
		super();
		this.id = id;
		this.name = name;
		this.region = region;
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

	public GameDTO getGame() {
		return game;
	}

	public void setGame(GameDTO game) {
		this.game = game;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TournamentDTO [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", region=");
		builder.append(region);
		builder.append(", game=");
		builder.append(game);
		builder.append("]");
		return builder.toString();
	}

}
