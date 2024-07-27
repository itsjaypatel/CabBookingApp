package com.itsjaypatel.cabbookingapp.services.impl;

import com.itsjaypatel.cabbookingapp.dtos.DriverDto;
import com.itsjaypatel.cabbookingapp.dtos.RideDto;
import com.itsjaypatel.cabbookingapp.dtos.RideRequestDto;
import com.itsjaypatel.cabbookingapp.dtos.RiderDto;
import com.itsjaypatel.cabbookingapp.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RiderServiceImpl implements RiderService {

    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
