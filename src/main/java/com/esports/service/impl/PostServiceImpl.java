package com.esports.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.esports.dto.PostDTO;
import com.esports.service.PostService;

@Service
public class PostServiceImpl implements PostService {

	public static final Logger logger = LoggerFactory.getLogger(PostServiceImpl.class);

	@Override
	public List<PostDTO> getPostList() {
		logger.debug("IN - getPosts");

		logger.debug("OUT - getPosts");
		return List.of(new PostDTO(1L, LocalDate.now(),
				"Riot Games announce they’ve reached 180 million active users across all Runeterra titles",
				"Riot Games has announced their active player base across all titles, which has hit an all-time high for the company.",
				"Riot Games announced the news of their all-time high on Twitter, saying they’ve reached over 180 million active players across all their titles set in Runeterra, the League of Legends universe.",
				"League of Legends", "esports.com", "../img/game.png"),
				new PostDTO(2L, LocalDate.now().minusDays(1),
						"Next year’s Call of Duty to be sequel to 2019 Modern Warfare",
						"Though Call of Duty Vanguard has yet to release, there are some big plans for the next installment in the franchise.",
						"Call of Duty Vangaurd is set to release on November 5th. Returning to World War II, Vanguard features a drastically new campaign, multiplayer, zombies, as well as additions to Warzone.",
						"Call of Duty,war", "Blaine Polhamus", "../img/game.png"));
	}

	@Override
	public List<PostDTO> getLatestPosts(Integer numPosts) {
		return null;
	}

	@Override
	public PostDTO getPost(Long id) {

		return new PostDTO(1L, LocalDate.now(),
				"Riot Games announce they’ve reached 180 million active users across all Runeterra titles",
				"Riot Games has announced their active player base across all titles, which has hit an all-time high for the company.",
				"Riot Games announced the news of their all-time high on Twitter, saying they’ve reached over 180 million active players across all their titles set in Runeterra, the League of Legends universe.",
				"League of Legends", "esports.com", "../img/game.png");
	}

}
