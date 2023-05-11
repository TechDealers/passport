package com.techdealers.passport.models;

import java.sql.Timestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "disponibilita")
public class Availability {
    @Id
    private Long id;

    @ManyToOne(cascade=CascadeType.PERSIST)
    private Staff staff;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Service service;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Office office;

    private Timestamp start_ts;

    private Timestamp end_ts;
}
