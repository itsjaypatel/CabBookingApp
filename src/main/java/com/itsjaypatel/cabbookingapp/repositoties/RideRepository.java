package com.itsjaypatel.cabbookingapp.repositoties;

import com.itsjaypatel.cabbookingapp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {
}
