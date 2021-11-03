package com.esports.dto;

import java.time.LocalDate;

public class PostDTO {

	private Long id;
	private LocalDate date;
	private String title;
	private String shortText;
	private String longText;
	private String tags;
	private String author;
	private String imgUrl;

	public PostDTO() {
	}

	public PostDTO(Long id, LocalDate date, String title, String shortText, String longText, String tags, String author,
			String imgUrl) {
		super();
		this.id = id;
		this.date = date;
		this.title = title;
		this.shortText = shortText;
		this.longText = longText;
		this.tags = tags;
		this.author = author;
		this.imgUrl = imgUrl;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShorttext() {
		return shortText;
	}

	public void setShorttext(String shorttext) {
		this.shortText = shorttext;
	}

	public String getLongText() {
		return longText;
	}

	public void setLongText(String longText) {
		this.longText = longText;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getShortText() {
		return shortText;
	}

	public void setShortText(String shortText) {
		this.shortText = shortText;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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
		builder.append("PostDTO [id=");
		builder.append(id);
		builder.append(", date=");
		builder.append(date);
		builder.append(", title=");
		builder.append(title);
		builder.append(", shortText=");
		builder.append(shortText);
		builder.append(", longText=");
		builder.append(longText);
		builder.append(", tags=");
		builder.append(tags);
		builder.append(", author=");
		builder.append(author);
		builder.append(", imgUrl=");
		builder.append(imgUrl);
		builder.append("]");
		return builder.toString();
	}
}
