package com.itsjaypatel.cabbookingapp.services;

import com.itsjaypatel.cabbookingapp.dtos.DriverDto;
import com.itsjaypatel.cabbookingapp.dtos.SignupDto;
import com.itsjaypatel.cabbookingapp.dtos.UserDto;

public interface AuthService {

    String login(String email,String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardDriver(Long userId);
}
