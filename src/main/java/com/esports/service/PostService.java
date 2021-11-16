package com.esports.service;

import java.util.List;

import com.esports.dto.PostDTO;

public interface PostService {

	List<PostDTO> getPostList();

	List<PostDTO> getLatestPosts(Integer numPosts);

	PostDTO getPostById(Long id);
}
