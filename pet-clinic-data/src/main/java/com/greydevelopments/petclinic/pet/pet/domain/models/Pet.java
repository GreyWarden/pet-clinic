package com.greydevelopments.petclinic.pet.pet.domain.models;

import com.greydevelopments.petclinic.pet.pettype.domain.models.PetType;
import com.greydevelopments.petclinic.person.owner.domain.models.Owner;
import com.greydevelopments.petclinic.shared.domain.models.base.BaseEntity;

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
