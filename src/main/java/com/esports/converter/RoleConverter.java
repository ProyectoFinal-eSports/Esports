package com.esports.converter;

import org.springframework.stereotype.Component;

import com.esports.model.dto.RoleDTO;
import com.esports.model.entity.Role;

@Component
public class RoleConverter implements GenericConverter<Role, RoleDTO> {

	@Override
	public RoleDTO apply(Role input) {

		return input.getId() == null
				? new RoleDTO(input.getName(), null)
				: new RoleDTO(input.getId(), input.getName(), null);
	}

}
