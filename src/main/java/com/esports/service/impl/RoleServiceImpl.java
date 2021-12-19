package com.esports.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esports.converter.PlayerConverter;
import com.esports.converter.RoleConverter;
import com.esports.converter.RoleDTOConverter;
import com.esports.model.dto.PlayerDTO;
import com.esports.model.dto.RoleDTO;
import com.esports.model.entity.Role;
import com.esports.repository.RoleRepository;
import com.esports.service.PlayerService;
import com.esports.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private PlayerService playerService;

	@Autowired
	private RoleConverter roleConverter;

	@Autowired
	private RoleDTOConverter roleDTOConverter;

	@Autowired
	private PlayerConverter playerConverter;

	@Override
	public List<RoleDTO> getRoleList() {
		List<Role> roles = roleRepository.findAll();
		List<RoleDTO> rolesDto = new ArrayList<>();
		RoleDTO roleTmp;

		for (final Role role : roles) {
			roleTmp = roleConverter.convert(role);
			roleTmp.setPlayers(playerConverter.convert(role.getPlayers()));
			rolesDto.add(roleTmp);
		}
		return rolesDto;
	}

	@Override
	public RoleDTO getRoleById(Long id) {
		Role role = roleRepository.findById(id).orElseThrow();
		RoleDTO roleDto = roleConverter.convert(role);
		roleDto.setPlayers(playerConverter.convert(role.getPlayers()));
		return roleDto;
	}

	@Override
	public RoleDTO saveRole(RoleDTO role) {
		Role roleToSave = roleDTOConverter.convert(role);
		Role roleSaved = roleRepository.save(roleToSave);

		for (PlayerDTO playerDto : role.getPlayers()) {
			playerDto.setRole(roleConverter.convert(roleSaved));
			playerService.savePlayer(playerDto);
		}

		final RoleDTO roleDtoResponse = roleConverter.convert(roleSaved);
		roleDtoResponse.setPlayers(playerService.getPlayersByRole(roleDtoResponse.getId()));

		return roleDtoResponse;
	}

}
