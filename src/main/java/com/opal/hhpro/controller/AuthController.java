package com.opal.hhpro.controller;

import com.opal.hhpro.dto.user.UserDTO;
import com.opal.hhpro.model.user.User;
import com.opal.hhpro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody UserDTO userDTO)
    {
        User user = userService.getUserByUsername(userDTO.getUsername());
        if(user != null && user.getPassword().equals(userDTO.getPassword()))
        {
            return "this is your token : bla bal bla";
        }
        return "something went wrong";
    }
}
