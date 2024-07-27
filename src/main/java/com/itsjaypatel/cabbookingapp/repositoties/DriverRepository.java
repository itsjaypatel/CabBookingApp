package com.itsjaypatel.cabbookingapp.repositoties;

import com.itsjaypatel.cabbookingapp.entities.Driver;
import com.itsjaypatel.cabbookingapp.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}
