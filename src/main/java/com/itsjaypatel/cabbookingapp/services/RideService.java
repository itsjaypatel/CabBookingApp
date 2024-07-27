package com.itsjaypatel.cabbookingapp.services;

import com.itsjaypatel.cabbookingapp.dtos.RideRequestDto;
import com.itsjaypatel.cabbookingapp.entities.Driver;
import com.itsjaypatel.cabbookingapp.entities.Ride;
import com.itsjaypatel.cabbookingapp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesForRider(Long riderId, PageRequest pageRequest);

    Page<Driver> getAllRidesForDriver(Long driverId, PageRequest pageRequest);
}
