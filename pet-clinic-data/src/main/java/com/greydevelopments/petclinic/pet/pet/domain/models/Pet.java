package com.greydevelopments.petclinic.pet.pet.domain.models;

import com.greydevelopments.petclinic.pet.pettype.domain.models.PetType;
import com.greydevelopments.petclinic.person.owner.domain.models.Owner;
import com.greydevelopments.petclinic.shared.domain.models.base.BaseEntity;

import java.time.LocalDate;

public class Pet extends BaseEntity {
    private String name;
    private LocalDate birthDate;
    private PetType petType;
    private Owner owner;

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    public Pet(Owner owner) {
        this.owner = owner;
    }

    public Pet(PetType petType) {
        this.petType = petType;
    }

    public Pet(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Pet(LocalDate birthDate, PetType petType) {
        this.birthDate = birthDate;
        this.petType = petType;
    }

    public Pet(LocalDate birthDate, PetType petType, Owner owner) {
        this.birthDate = birthDate;
        this.petType = petType;
        this.owner = owner;
    }

    public Pet(String name, LocalDate birthDate, PetType petType, Owner owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.petType = petType;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
