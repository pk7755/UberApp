package com.pradyumna.project.uber.uberApp.services;

import com.pradyumna.project.uber.uberApp.dto.DriverDto;
import com.pradyumna.project.uber.uberApp.dto.SignupDto;
import com.pradyumna.project.uber.uberApp.dto.UserDto;

public interface AuthService {

    String login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onBoardNewDriver(Long userId);
}
