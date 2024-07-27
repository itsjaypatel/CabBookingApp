package com.itsjaypatel.cabbookingapp.dtos;

import com.itsjaypatel.cabbookingapp.entities.PaymentMethod;
import com.itsjaypatel.cabbookingapp.entities.enums.RideRequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDto {

    private Long id;

    private RiderDto rider;

    private RideRequestStatus rideRequestStatus;

    private Point pickupLocation;

    private Point dropOffLocation;

    private LocalDateTime requestedTime;

    private PaymentMethod paymentMethod;
}
