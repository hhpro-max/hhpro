package com.opal.hhpro.service;

import com.opal.hhpro.dto.user.UserDTO;
import com.opal.hhpro.model.user.User;

public interface UserService {
    User getUserById(Long id);
    User getUserByUsername(String username);
    User createNewUser(UserDTO userDTO);
}
