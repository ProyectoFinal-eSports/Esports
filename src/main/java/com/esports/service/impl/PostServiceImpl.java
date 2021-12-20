package com.esports.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esports.converter.PostConverter;
import com.esports.converter.PostDTOConverter;
import com.esports.model.dto.PostDTO;
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

		List<Post> posts = postRepository.findAllByOrderByDateDesc();
		if (!isRegistrado) {
			posts = filtrarPosts(posts);
		}

		return postConverter.convert(posts);
	}

	private List<Post> filtrarPosts(List<Post> posts) {
		List<Post> postFiltrados = new ArrayList<>();
		for (Post post : posts) {
			if (post.getRegistered() != null && post.getRegistered()) {
				continue;
			}
			postFiltrados.add(post);
		}
		return postFiltrados;
	}

	@Override
	public List<PostDTO> getLatestPosts(Boolean isRegistrado) {
		List<Post> latest = null;
		if (isRegistrado)
			latest = postRepository.findTop3ByOrderByDateDesc();
		else
			latest = postRepository.findTop3ByRegisteredOrderByDateDesc(isRegistrado);

		List<PostDTO> latestDTO = postConverter.convert(latest);

		return latestDTO;
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

	@Override
	public PostDTO updatePost(PostDTO postDTO) {
		Long id = postDTO.getId();
		Optional<Post> post = postRepository.findById(id);
		if (!post.isPresent())
			return null;

		Post postUpdated = postDTOConverter.convert(postDTO);
		postRepository.save(postUpdated);

		return postDTO;
	}

	@Override
	public void deletePost(Long id) {
		postRepository.deleteById(id);
	}

}
