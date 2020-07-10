package com.greywarden.petclinic.pet.pet.domain.models;

import com.greywarden.petclinic.pet.pettype.domain.models.PetType;
import com.greywarden.petclinic.person.owner.domain.models.Owner;
import com.greywarden.petclinic.shared.domain.models.base.BaseEntity;

import java.time.LocalDate;

public class Pet extends BaseEntity {
    private LocalDate birthDate;
    private PetType petType;
    private Owner owner;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
