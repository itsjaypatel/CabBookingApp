package com.itsjaypatel.cabbookingapp.controllers;

import com.itsjaypatel.cabbookingapp.dtos.DriverDto;
import com.itsjaypatel.cabbookingapp.dtos.RideDto;
import com.itsjaypatel.cabbookingapp.dtos.RiderDto;
import com.itsjaypatel.cabbookingapp.entities.enums.RideStatus;
import com.itsjaypatel.cabbookingapp.services.DriverService;
import com.itsjaypatel.cabbookingapp.utils.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver")
@RequiredArgsConstructor
public class DriverController {

    private final DriverService driverService;

    @PatchMapping("/ride/{rideId}/{status}")
    public ResponseEntity<ApiResponse<?>> updateRide(@PathVariable Long rideId, @PathVariable  RideStatus status) {
        RideDto updatedRide = switch (status) {
            case CONFIRMED -> driverService.acceptRide(rideId);
            case ENDED -> driverService.endRide(rideId);
            case ON_GOING -> driverService.startRide(rideId);
            case CANCELLED -> driverService.cancelRide(rideId);
            default -> throw new RuntimeException("INVALID STATUS");
        };
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/rate/{rideId}/rating/{x}")
    public ResponseEntity<ApiResponse<?>> rateRide(@PathVariable Long rideId, @PathVariable Integer x) {
        RiderDto riderDto = driverService.rateRider(rideId,x);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/profile")
    public ResponseEntity<ApiResponse<?>> getProfile() {
        DriverDto myProfile = driverService.getMyProfile();
        return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse<>(HttpStatus.OK.value(), myProfile));
    }

    @GetMapping("/getAllRides")
    public ResponseEntity<ApiResponse<?>> getAllRides() {
        List<RideDto> myRides = driverService.getAllMyRides();
        return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse<>(HttpStatus.OK.value(), myRides));
    }


}
