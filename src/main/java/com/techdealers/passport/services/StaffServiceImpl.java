package com.techdealers.passport.services;

import com.techdealers.passport.models.Staff;
import com.techdealers.passport.repositories.StaffRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StaffServiceImpl implements StaffService{

    private final StaffRepository staffRepository;

    @Autowired
    public StaffServiceImpl(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }


    @Override
    public Staff getById(Long id) {
        return staffRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Staff> getAll() {
        return staffRepository.findAll();
    }

    @Override
    public void save(Staff staff) {
        staffRepository.save(staff);
    }

    @Override
    public void delete(Staff staff) {
        staffRepository.delete(staff);
    }
}
