package com.opal.hhpro.service.implementation;

import com.opal.hhpro.dto.user.UserDTO;
import com.opal.hhpro.model.user.User;
import com.opal.hhpro.repository.UserRepository;
import com.opal.hhpro.service.UserService;
import com.opal.hhpro.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }

    @Override
    public User createNewUser(UserDTO userDTO) {
        return userRepository.save(UserMapper.mapToEntity(userDTO));
    }
}
