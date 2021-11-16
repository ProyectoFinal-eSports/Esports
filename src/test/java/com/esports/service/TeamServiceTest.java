package com.esports.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.esports.dto.TeamDTO;

@SpringBootTest
class TeamServiceTest {

	@Autowired
	TeamService teamService;

	@Test
	void test() {
		Assertions.assertTrue(true);
	}

	@Test
	void getTeamByIdTest() {
		TeamDTO team = teamService.getTeamById(1L);
		Assertions.assertNotNull(team);

	}
}
