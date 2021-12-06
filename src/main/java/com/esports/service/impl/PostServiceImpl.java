package com.esports.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esports.converter.PostConverter;
import com.esports.converter.PostDTOConverter;
import com.esports.dto.PostDTO;
import com.esports.model.entity.Post;
import com.esports.repository.PostRepository;
import com.esports.service.PostService;

@Service
public class PostServiceImpl implements PostService {

	public static final Logger logger = LoggerFactory.getLogger(PostServiceImpl.class);

	@Autowired
	private PostRepository postRepository;

	@Autowired
	private PostConverter postConverter;

	@Autowired
	private PostDTOConverter postDTOConverter;

	@Override
	public List<PostDTO> getPostList(Boolean isRegistrado) {
		logger.debug("IN - getPosts");
		List<Post> posts = postRepository.findAll();
		if (!isRegistrado) {
			posts = filtrarPosts(posts);
		}
		List<PostDTO> postsDto = new ArrayList<>();
		PostDTO postTmp;

		for (final Post post : posts) {
			postTmp = postConverter.convert(post);
			postsDto.add(postTmp);
		}
		logger.debug("OUT - getPosts");
		return postsDto;

	}

	private List<Post> filtrarPosts(List<Post> posts) {
		List<Post> postFiltrados = new ArrayList<>();
		for (Post post : posts) {
			if(post.getRegistered()) {
				continue;
			}
			postFiltrados.add(post);
		}
		
		return postFiltrados;
	}

	@Override
	public List<PostDTO> getLatestPosts(Integer numPosts) {
		return null;
	}

	@Override
	public PostDTO getPostById(Long id) {
		Post post = postRepository.findById(id).orElseThrow();
		PostDTO postDto = postConverter.convert(post);

		return postDto;
	}

	@Override
	public PostDTO savePost(PostDTO post) {
		Post postSaved = postRepository.save(postDTOConverter.convert(post));
		PostDTO newPostSaved = postConverter.convert(postSaved);
		return newPostSaved;
	}

}
