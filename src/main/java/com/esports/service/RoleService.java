package com.esports.service;

import java.util.List;

import com.esports.dto.RoleDTO;

public interface RoleService {

	List<RoleDTO> getRoleList();

	RoleDTO getRoleById(Long id);

	RoleDTO saveRole(RoleDTO role);
}
