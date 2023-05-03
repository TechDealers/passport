package com.techdealers.passport.services;

import com.techdealers.passport.models.Staff;


public interface StaffService {
    Staff getById(Long id);
    Iterable<Staff> getAll();
    void save(Staff staff);
    void delete(Staff staff);
}
