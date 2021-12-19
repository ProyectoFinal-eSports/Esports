package com.esports.converter;

import org.springframework.stereotype.Component;

import com.esports.model.dto.RoleDTO;
import com.esports.model.entity.Role;

@Component
public class RoleDTOConverter implements GenericConverter<RoleDTO, Role>{

	@Override
	public Role apply(RoleDTO input) {
		
		return input.getId() == null
				? new Role(input.getName(),null)
				: new Role(input.getId(),input.getName(),null);
	}

}
