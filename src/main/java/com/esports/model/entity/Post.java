package com.esports.model.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	private String title;

	private LocalDate date;

	@Column(name = "short_text")
	private String shortText;

	@Column(name = "long_text", columnDefinition = "TEXT")
	private String longText;

	private String tags;

	private String author;

	@Column(name = "img_url")
	private String imgUrl;

	private Boolean registered;

	public Post() {
	}

	public Post(Long id) {
		super();
		this.id = id;
	}

	public Post(Long id, String title, LocalDate date, String shortText, String longText, String tags, String author,
			String imgUrl) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.shortText = shortText;
		this.longText = longText;
		this.tags = tags;
		this.author = author;
		this.imgUrl = imgUrl;
	}

	public Post(String title, LocalDate date, String shortText, String longText, String tags, String author,
			String imgUrl) {
		super();
		this.title = title;
		this.date = date;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getShortText() {
		return shortText;
	}

	public void setShortText(String shortText) {
		this.shortText = shortText;
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

	public Boolean getRegistered() {
		return registered;
	}

	public void setRegistered(Boolean registered) {
		this.registered = registered;
	}

}
