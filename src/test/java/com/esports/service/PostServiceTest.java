package com.esports.service;

import com.esports.model.dto.PostDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PostServiceTest {

	@Autowired
	PostService postService;

	@Test
	void givenAnonymousUser_thenGetOnlyPublicPosts() {
		Boolean usuarioRegistrado = false;
		List<PostDTO> posts = postService.getPostList(usuarioRegistrado);
		Assertions.assertNotNull(posts);
		for(PostDTO post:posts)
			Assertions.assertFalse(post.getRegistered());
	}

	@Test
	void givenAnonymousUser_thenGetLatestPosts() {
		Boolean usuarioRegistrado = false;
		List<PostDTO> allPosts = postService.getPostList(usuarioRegistrado);
		List<PostDTO> latestPosts = postService.getLatestPosts(usuarioRegistrado);
		Assertions.assertNotNull(allPosts);
		Assertions.assertNotNull(latestPosts);
		Assertions.assertTrue(allPosts.size() >= latestPosts.size());
	}

	@Test
	void givenRegisteredUser_thenGetAllPosts() {
		Boolean usuarioRegistrado = true;
		List<PostDTO> posts = postService.getPostList(usuarioRegistrado);
		Assertions.assertNotNull(posts);
		Assertions.assertTrue(posts.size() > 0);
	}

	@Test
	void givenRegisteredUser_thenGetLatestPosts() {
		Boolean usuarioRegistrado = true;
		List<PostDTO> posts = postService.getLatestPosts(usuarioRegistrado);
		Assertions.assertNotNull(posts);
		Assertions.assertTrue(posts.size() == 3); // top 3 Orderby date Desc
	}

}
