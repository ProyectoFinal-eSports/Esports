package com.esports.model.dto;

import org.springframework.web.multipart.MultipartFile;

public class GameFormDTO {

	private GameDTO game;
	private MultipartFile file;

	public GameDTO getGame() {
		return game;
	}

	public void setGame(GameDTO game) {
		this.game = game;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "GameFormDTO{" + "game=" + game + ", file=" + (file == null ? "" : file.getOriginalFilename()) + '}';
	}
}
