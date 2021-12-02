package com.esports.dto;

import java.util.List;

public class PostFormDTO {

	private PostDTO post;
	private List<PostDTO> posts;

	public PostDTO getPost() {
		return post;
	}

	public void setPost(PostDTO post) {
		this.post = post;
	}

	public List<PostDTO> getPosts() {
		return posts;
	}

	public void setPosts(List<PostDTO> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PostFormDTO [post=");
		builder.append(post);
		builder.append(", posts=");
		builder.append(posts);
		builder.append("]");
		return builder.toString();
	}

}
