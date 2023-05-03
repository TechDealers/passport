package com.techdealers.passport.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message="Please enter your email address.")
    @Email(message="Please enter a valid email address.")
    @Column(unique = true)
    private String email;

}
