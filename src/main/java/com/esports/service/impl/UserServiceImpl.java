package com.esports.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esports.dto.UserDTO;
import com.esports.model.entity.User;
import com.esports.repository.UserRepository;
import com.esports.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User authUser(String loginname, String password) {
		Optional<User> user = userRepository.findByLoginname(loginname);
		if (!user.isPresent())
			return null;

		User userData = user.get();

		if (userData.getPassword().equals(password) && userData.isAdmin())
			return userData;

		return null;
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
