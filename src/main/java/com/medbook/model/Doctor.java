package com.medbook.model;

import jakarta.persistence.*;

@Entity
name = "doctors"
public class Doctor {

    @Id
    strategy = GenerationType.IDENTITY
    private Long id;

    private String name;

    private String specialty;

    public Doctor() {
    }

    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}


