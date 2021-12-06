package com.esports.service;

import java.util.List;

import com.esports.dto.PostDTO;

public interface PostService {

	List<PostDTO> getPostList(Boolean isRegistrado);

	List<PostDTO> getLatestPosts(Integer numPosts);

	PostDTO getPostById(Long id);

	PostDTO savePost(PostDTO post);
}
