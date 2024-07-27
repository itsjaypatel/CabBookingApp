package com.itsjaypatel.cabbookingapp.strategies.impl;

import com.itsjaypatel.cabbookingapp.dtos.RideRequestDto;
import com.itsjaypatel.cabbookingapp.strategies.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {

    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
