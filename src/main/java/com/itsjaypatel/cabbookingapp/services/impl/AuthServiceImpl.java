package com.itsjaypatel.cabbookingapp.services.impl;

import com.itsjaypatel.cabbookingapp.dtos.DriverDto;
import com.itsjaypatel.cabbookingapp.dtos.SignupDto;
import com.itsjaypatel.cabbookingapp.dtos.UserDto;
import com.itsjaypatel.cabbookingapp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
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
    public DriverDto onboardDriver(Long userId) {
        return null;
    }
}
