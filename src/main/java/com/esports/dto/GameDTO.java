package com.esports.dto;

public class GameDTO {

	private Long id;
	private String name;
	private String genre;
	private String tags;
	private String imgUrl;

	public GameDTO() {
	}

	public GameDTO(Long id, String name, String genre, String tags, String imgUrl) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.tags = tags;
		this.imgUrl = imgUrl;
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

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
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
		builder.append(", tags=");
		builder.append(tags);
		builder.append(", imgUrl=");
		builder.append(imgUrl);
		builder.append("]");
		return builder.toString();
	}

}
