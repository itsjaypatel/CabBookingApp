package com.itsjaypatel.cabbookingapp.services.impl;

import com.itsjaypatel.cabbookingapp.dtos.DriverDto;
import com.itsjaypatel.cabbookingapp.dtos.SignupDto;
import com.itsjaypatel.cabbookingapp.dtos.UserDto;
import com.itsjaypatel.cabbookingapp.entities.Rider;
import com.itsjaypatel.cabbookingapp.entities.User;
import com.itsjaypatel.cabbookingapp.entities.enums.Role;
import com.itsjaypatel.cabbookingapp.exceptions.UserAlreadySignUpException;
import com.itsjaypatel.cabbookingapp.repositoties.UserRepository;
import com.itsjaypatel.cabbookingapp.services.AuthService;
import com.itsjaypatel.cabbookingapp.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final RiderService riderService;
    private final ModelMapper modelMapper;

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    @Transactional
    public UserDto signup(SignupDto signupDto) {
        Optional<User> optionalUser = userRepository.findByEmail(signupDto.getEmail());
        if (optionalUser.isPresent()) {
            throw new UserAlreadySignUpException("User already signed up with email: " + signupDto.getEmail());
        }
        User user = userRepository.save(User.builder()
                .name(signupDto.getName())
                .email(signupDto.getEmail())
                .password(signupDto.getPassword())
                .roles(Set.of(Role.RIDER))
                .build());
        Rider rider = riderService.createRider(Rider.builder().user(user).rating(0.0).build());
        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public DriverDto onboardDriver(Long userId) {
        return null;
    }
}
