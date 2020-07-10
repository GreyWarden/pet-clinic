package com.greydevelopments.petclinic.person.vet.vet.domain.models;

import com.greydevelopments.petclinic.person.vet.specialty.domain.models.Specialty;
import com.greydevelopments.petclinic.person.shared.domain.models.Person;

import java.util.Set;

public final class Vet extends Person {
    private Set<Specialty> specialties;

    public Vet() {
    }

    public Vet(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Vet(String firstName, String lastName, Set<Specialty> specialties) {
        super(firstName, lastName);
        this.specialties = specialties;
    }

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
