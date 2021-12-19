package com.esports.service.impl;

import java.util.Optional;

import com.esports.model.SecurityRole;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esports.model.dto.UserDTO;
import com.esports.model.entity.User;
import com.esports.repository.UserRepository;
import com.esports.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDTO authUser(String loginname, String password) {
		UserDTO userDto = null;

		Optional<User> user = userRepository.findByLoginname(loginname);
		if (!user.isPresent())
			return null;

		User userData = user.get();

		//&& userData.getSecurityRole() == SecurityRole.ADMIN)
		if (userData.getPassword().equals(password)) {
			userDto = new UserDTO();
			BeanUtils.copyProperties(userData, userDto);
			if (userData.getSecurityRole() == SecurityRole.ADMIN)
				userDto.setAdmin(true);
		}

		return userDto;
	}

	@Override
	public UserDTO createUser(UserDTO userDTO) {
		User user = new User();

		BeanUtils.copyProperties(userDTO, user);

		User userData = userRepository.save(user);
		userDTO.setId(userData.getId());

		return userDTO;
	}

}
