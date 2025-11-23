package com.pradyumna.project.uber.uberApp.services.impl;

import com.pradyumna.project.uber.uberApp.dto.DriverDto;
import com.pradyumna.project.uber.uberApp.dto.SignupDto;
import com.pradyumna.project.uber.uberApp.dto.UserDto;
import com.pradyumna.project.uber.uberApp.services.AuthService;

public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onBoardNewDriver(Long userId) {
        return null;
    }
}
