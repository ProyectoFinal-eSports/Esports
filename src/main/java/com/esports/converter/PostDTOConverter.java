package com.esports.converter;

import org.springframework.stereotype.Component;

import com.esports.model.dto.PostDTO;
import com.esports.model.entity.Post;

@Component
public class PostDTOConverter implements GenericConverter<PostDTO, Post> {

	@Override
	public Post apply(PostDTO input) {

		return input.getId() == null
				? new Post(input.getTitle(), input.getDate(), input.getShortText(), input.getLongText(),
						input.getTags(), input.getAuthor(), input.getImgUrl(), input.getRegistered())
				: new Post(input.getId(), input.getTitle(), input.getDate(), input.getShortText(), input.getLongText(),
						input.getTags(), input.getAuthor(), input.getImgUrl(), input.getRegistered());
	}

}
