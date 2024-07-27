package com.itsjaypatel.cabbookingapp.controllers;

import com.itsjaypatel.cabbookingapp.dtos.DriverDto;
import com.itsjaypatel.cabbookingapp.dtos.RideDto;
import com.itsjaypatel.cabbookingapp.dtos.RideRequestDto;
import com.itsjaypatel.cabbookingapp.dtos.RiderDto;
import com.itsjaypatel.cabbookingapp.services.RiderService;
import com.itsjaypatel.cabbookingapp.utils.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rider")
@RequiredArgsConstructor
public class RiderController {

    private final RiderService riderService;

    @PostMapping("/requestRide")
    public ResponseEntity<ApiResponse<?>> requestRide(@RequestBody RideRequestDto rideRequestDto) {
        RideRequestDto savedRideRequestDto = riderService.requestRide(rideRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse<>(HttpStatus.CREATED.value(), savedRideRequestDto));
    }


    @GetMapping("/profile")
    public ResponseEntity<ApiResponse<?>> getMyProfile() {
        RiderDto myProfile = riderService.getMyProfile();
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse<>(HttpStatus.OK.value(), myProfile));
    }

    @PatchMapping("/rate/ride/{rideId}/rating/{x}")
    public ResponseEntity<ApiResponse<?>> rateRide(@PathVariable Long rideId, @PathVariable Integer x) {
        DriverDto driverDto = riderService.rateDriver(rideId,x);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/cancel/ride/{rideId}")
    public ResponseEntity<ApiResponse<?>> cancelRide(@PathVariable Long rideId) {
        RideDto driverDto = riderService.cancelRide(rideId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/getAllRides")
    public ResponseEntity<ApiResponse<?>> getAllRides() {
        List<RideDto> myRides = riderService.getAllMyRides();
        return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse<>(HttpStatus.OK.value(), myRides));
    }
}
