package com.itsjaypatel.cabbookingapp.repositoties;

import com.itsjaypatel.cabbookingapp.entities.Rider;
import com.itsjaypatel.cabbookingapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {
}
