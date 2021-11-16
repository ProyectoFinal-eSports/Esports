package com.esports.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Runner {

	@Profile("local")
	@Bean
	public ApplicationRunner localApplicationRunner() {

		return arg -> runnerData();
	}

	public void runnerData() {

		// Game game = new Game("League of Legends", "MOBA", "LoL,Riot Games");
		// Game gameSaved = gameRepo.save(game);
	}

}
