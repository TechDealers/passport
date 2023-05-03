package com.techdealers.passport.repositories;

import com.techdealers.passport.models.Staff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StaffRepository extends CrudRepository<Staff, Long> {

}
