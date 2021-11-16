package com.esports.service;

import java.util.List;

import com.esports.dto.ClubDTO;

public interface ClubService {

	List<ClubDTO> getClubList();

	ClubDTO getClubById(Long id);
}
