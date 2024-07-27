package com.itsjaypatel.cabbookingapp.controllers;

import com.itsjaypatel.cabbookingapp.dtos.DriverDto;
import com.itsjaypatel.cabbookingapp.dtos.LoginDto;
import com.itsjaypatel.cabbookingapp.dtos.SignupDto;
import com.itsjaypatel.cabbookingapp.dtos.UserDto;
import com.itsjaypatel.cabbookingapp.services.AuthService;
import com.itsjaypatel.cabbookingapp.utils.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<?>> login(@RequestBody LoginDto loginDto) {
        String token = authService.login(loginDto.getEmail(), loginDto.getPassword());
        return ResponseEntity.ok(new ApiResponse<>(HttpStatus.OK.value(), token));
    }

    @PostMapping("/signup")
    public ResponseEntity<ApiResponse<?>> signup(@RequestBody SignupDto signupDto) {
        UserDto user = authService.signup(signupDto);
        return ResponseEntity.ok(new ApiResponse<>(HttpStatus.OK.value(), user));
    }

    @PostMapping("/onboardDriver/{driverId}")
    public ResponseEntity<ApiResponse<?>> onboardDriver(@PathVariable Long driverId) {
        DriverDto driver = authService.onboardDriver(driverId);
        return ResponseEntity.ok(new ApiResponse<>(HttpStatus.CREATED.value(), driver));
    }
}
