package com.techdealers.passport.services;

import java.util.Set;

import com.techdealers.passport.models.Availability;
import com.techdealers.passport.models.Staff;


public interface AvailabilityService {
    Set<Availability> getByStaff(Staff staff);
    Iterable<Staff> getAll();
    void save(Staff staff);
    void delete(Staff staff);
}

