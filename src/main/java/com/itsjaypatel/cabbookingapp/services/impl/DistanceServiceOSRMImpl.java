package com.itsjaypatel.cabbookingapp.services.impl;

import com.itsjaypatel.cabbookingapp.services.DistanceService;
import lombok.Data;
import lombok.Setter;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point dest) {
        return 0;
    }
}
