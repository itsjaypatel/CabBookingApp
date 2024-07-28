package com.itsjaypatel.cabbookingapp.services.impl;

import com.itsjaypatel.cabbookingapp.dtos.DriverDto;
import com.itsjaypatel.cabbookingapp.dtos.RideDto;
import com.itsjaypatel.cabbookingapp.dtos.RideRequestDto;
import com.itsjaypatel.cabbookingapp.dtos.RiderDto;
import com.itsjaypatel.cabbookingapp.entities.RideRequest;
import com.itsjaypatel.cabbookingapp.entities.Rider;
import com.itsjaypatel.cabbookingapp.entities.enums.RideRequestStatus;
import com.itsjaypatel.cabbookingapp.exceptions.ResourceNotFoundException;
import com.itsjaypatel.cabbookingapp.repositoties.RiderRepository;
import com.itsjaypatel.cabbookingapp.services.RideRequestService;
import com.itsjaypatel.cabbookingapp.services.RiderService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class RiderServiceImpl implements RiderService {

    private final RiderRepository riderRepository;
    private final RideRequestService rideRequestService;
    private final ModelMapper modelMapper;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return modelMapper.map(rideRequestService.createRideRequest(rideRequestDto,currentRider()), RideRequestDto.class);
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

    @Override
    public Rider createRider(Rider rider) {
        return riderRepository.save(rider);
    }

    @Override
    public Rider currentRider() {
        //TODO: get current rider using spring security
        return riderRepository
                .findById(1L)
                .orElseThrow(() -> new ResourceNotFoundException("Rider is not found with id: " + 1L));
    }
}
