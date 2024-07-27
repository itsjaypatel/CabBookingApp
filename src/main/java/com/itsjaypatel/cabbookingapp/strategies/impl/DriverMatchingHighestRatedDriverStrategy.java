package com.itsjaypatel.cabbookingapp.strategies.impl;

import com.itsjaypatel.cabbookingapp.dtos.RideRequestDto;
import com.itsjaypatel.cabbookingapp.entities.Driver;
import com.itsjaypatel.cabbookingapp.strategies.DriverMatchingStrategy;

import java.util.List;


public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {

    @Override
    public List<Driver> findMatchingDrivers(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
