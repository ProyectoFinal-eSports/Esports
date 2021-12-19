package com.esports.service;

import java.util.List;

import com.esports.model.dto.PostDTO;

public interface PostService {

	List<PostDTO> getPostList(Boolean isRegistrado);

	List<PostDTO> getLatestPosts(Boolean isRegistrado);

	PostDTO getPostById(Long id);

	PostDTO savePost(PostDTO post);

	PostDTO updatePost(PostDTO postDTO);

	void deletePost(Long id);
}
