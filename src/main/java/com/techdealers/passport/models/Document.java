package com.techdealers.passport.models;

import java.util.Set;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Document {
    @Id
    private Long id;

    @Column
    @NotBlank
    private String name;

    @Column
    @NotBlank
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "documents_services", joinColumns = { @JoinColumn(name = "document_id") }, inverseJoinColumns = {
            @JoinColumn(name = "service_id") })
    private Set<Service> services;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Service> getService() {
        return services;
    }

    public void setService(Set<Service> services) {
        this.services = services;
    }
}
