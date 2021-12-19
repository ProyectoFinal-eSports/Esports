package com.esports.model.dto;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class PostFormDTO {

	private PostDTO post;
	private List<PostDTO> posts;
	private MultipartFile file;

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

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "PostFormDTO{" +
				"post=" + post +
				", posts=" + (posts == null ? "" : posts.toString()) +
				", file=" + (file == null ? "" : file.getOriginalFilename()) +
				'}';
	}
}
