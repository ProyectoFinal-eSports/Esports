package com.esports.service;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.esports.dto.PlayerDTO;
import com.esports.model.entity.Player;

@SpringBootTest
class PlayerServiceTest {

	@Autowired
	PlayerService playerService;

	@Test
	void test() {
		Assertions.assertTrue(true);
	}

	@Test
	void getAllPlayersTest() {
		List<PlayerDTO> players = playerService.getPlayerList();
		Assertions.assertNotNull(players);
		Assertions.assertTrue(players.size() > 0);
		Assertions.assertFalse(players.get(0).getTeam().getId() == 2);
		Assertions.assertEquals(players.get(0).getTeam().getId(), 1);
	}

	@Test
	void getPlayersByTeamTest() {
		List<PlayerDTO> players = playerService.getPlayersByTeam(1L);
		Assertions.assertNotNull(players);
		Assertions.assertTrue(players.size() > 0);
		Assertions.assertEquals(players.size(), 2);
	}

}
