package com.techdealers.passport.repositories;

import com.techdealers.passport.models.Availability;
import com.techdealers.passport.models.Staff;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvailabilityRepository extends JpaRepository<Availability, Long> {
    public Set<Availability> findAvailabilityByStaffId(Staff staff);
}
