package com.itsjaypatel.cabbookingapp.strategies;

import com.itsjaypatel.cabbookingapp.dtos.RideRequestDto;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);
}
