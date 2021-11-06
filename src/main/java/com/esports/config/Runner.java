package com.esports.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.esports.model.entity.Game;
import com.esports.repository.GameRepository;

@Configuration
public class Runner {

	final GameRepository gameRepo;

	public Runner(GameRepository gameRepo) {
		super();
		this.gameRepo = gameRepo;
	}

	public GameRepository getGameRepo() {
		return gameRepo;
	}

	@Profile("local")
	@Bean
	public ApplicationRunner localApplicationRunner() {

		return arg -> runnerData();
	}

	public void runnerData() {

		//Game game = new Game("League of Legends", "MOBA", "LoL,Riot Games");
		//Game gameSaved = gameRepo.save(game);
	}

}
