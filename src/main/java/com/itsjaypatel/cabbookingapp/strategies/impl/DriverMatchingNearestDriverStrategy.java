package com.itsjaypatel.cabbookingapp.strategies.impl;

import com.itsjaypatel.cabbookingapp.dtos.RideRequestDto;
import com.itsjaypatel.cabbookingapp.entities.Driver;
import com.itsjaypatel.cabbookingapp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    @Override
    public List<Driver> findMatchingDrivers(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
