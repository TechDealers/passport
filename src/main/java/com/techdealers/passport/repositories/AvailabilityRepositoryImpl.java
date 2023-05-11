package com.techdealers.passport.repositories;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.techdealers.passport.models.Availability;
import com.techdealers.passport.models.Staff;

/**
 * AvailabilityRepositoryImpl
 */
public class AvailabilityRepositoryImpl  implements AvailabilityRepository {

    @Override
    public Set<Availability> findAvailabilityByStaffId(Staff staff) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAvailabilityByStaffId'");
    }

    
}
