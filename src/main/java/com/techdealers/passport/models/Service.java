package com.techdealers.passport.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Set;

@Entity
public class Service {
    @Id
    private Long id;

    @Column
    @NotBlank
    private String name;

    @Column
    @NotBlank
    @ManyToMany(targetEntity = Document.class, cascade = CascadeType.ALL, mappedBy = "services")
    private Set<Document> documents;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(Set<Document> documents) {
        this.documents = documents;
    }
}
