package com.esports.service;

import com.esports.model.dto.UserDTO;
import com.esports.model.entity.User;

public interface UserService {

	UserDTO authUser(String loginname, String password);

	UserDTO createUser(UserDTO user);
}
