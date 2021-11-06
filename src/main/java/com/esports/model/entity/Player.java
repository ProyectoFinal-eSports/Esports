package com.esports.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player {

	// =======================================

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	private String name;

	private String role;

	private String tags;

	private String imgUrl;

	@ManyToOne
	private Team team;

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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Player{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", role='").append(role).append('\'');
		sb.append(", tags='").append(tags).append('\'');
		sb.append(", imgUrl='").append(imgUrl).append('\'');
		sb.append(", team=").append(team);
		sb.append('}');
		return sb.toString();
	}
}
