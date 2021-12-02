package com.esports.converter;

import org.springframework.stereotype.Component;

import com.esports.dto.PostDTO;
import com.esports.model.entity.Post;

@Component
public class PostConverter implements GenericConverter<Post, PostDTO> {

	@Override
	public PostDTO apply(Post input) {

		return input.getId() == null
				? new PostDTO(input.getTitle(), input.getDate(), input.getShortText(), input.getLongText(),
						input.getTags(), input.getAuthor(), input.getImgUrl())
				: new PostDTO(input.getId(), input.getTitle(), input.getDate(), input.getShortText(),
						input.getLongText(), input.getTags(), input.getAuthor(), input.getImgUrl());
	}

}
