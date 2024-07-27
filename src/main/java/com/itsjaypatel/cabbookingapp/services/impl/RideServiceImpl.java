package com.itsjaypatel.cabbookingapp.services.impl;

import com.itsjaypatel.cabbookingapp.dtos.RideRequestDto;
import com.itsjaypatel.cabbookingapp.entities.Driver;
import com.itsjaypatel.cabbookingapp.entities.Ride;
import com.itsjaypatel.cabbookingapp.entities.enums.RideStatus;
import com.itsjaypatel.cabbookingapp.services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {

    @Override
    public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesForRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Driver> getAllRidesForDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
