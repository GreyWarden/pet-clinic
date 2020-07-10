package com.greydevelopments.petclinic.vet.vet.domain.models;

import com.greydevelopments.petclinic.vet.specialty.domain.models.Specialty;
import com.greydevelopments.petclinic.person.shared.domain.models.Person;

import java.util.Set;

public final class Vet extends Person {
    private Set<Specialty> specialties;

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}