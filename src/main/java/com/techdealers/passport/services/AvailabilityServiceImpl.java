package com.techdealers.passport.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techdealers.passport.models.Availability;
import com.techdealers.passport.models.Staff;
import com.techdealers.passport.repositories.AvailabilityRepository;

import jakarta.transaction.Transactional;

/**
 * AvailabilityServiceImpl
 */
@Service
@Transactional
public class AvailabilityServiceImpl implements AvailabilityService {

    private final AvailabilityRepository availabilityRepository;

    @Autowired
    public AvailabilityServiceImpl(AvailabilityRepository availabilityRepository) {
        this.availabilityRepository = availabilityRepository;
    }

    @Override
    public Set<Availability> getByStaff(Staff staff) {
        return availabilityRepository.findAvailabilityByStaffId(staff);
    }

    @Override
    public Iterable<Staff> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public void save(Staff staff) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void delete(Staff staff) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
