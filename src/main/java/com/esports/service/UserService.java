package com.esports.service;

import com.esports.dto.UserDTO;
import com.esports.model.entity.User;

public interface UserService {

	User authUser(String loginname, String password);

	UserDTO createUser(UserDTO user);
}
