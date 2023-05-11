package com.techdealers.passport.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

public class Booking {
    public enum BookingState {
        PENDING,
        CONFIRMED,
        DECLINED,
        COMPLETED
    }

    @Id
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private User user;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Availability availability;

    @Enumerated(EnumType.STRING)
    private BookingState state = BookingState.PENDING;

    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((state == null) ? 0 : state.hashCode());
    //     return result;
    // }
    //
    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Booking other = (Booking) obj;
    //     if (state != other.state)
    //         return false;
    //     return true;
    // }

    public BookingState getState() {
        return state;
    }
}
