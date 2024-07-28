package com.itsjaypatel.cabbookingapp.services;

import com.itsjaypatel.cabbookingapp.dtos.RideRequestDto;
import com.itsjaypatel.cabbookingapp.entities.RideRequest;
import com.itsjaypatel.cabbookingapp.entities.Rider;

public interface RideRequestService {

    RideRequest createRideRequest(RideRequestDto rideRequestDto, Rider rider);
}
