package com.greydevelopments.petclinic.person.vet.specialty.domain.models;

import com.greydevelopments.petclinic.shared.domain.models.base.BaseEntity;

public final class Specialty extends BaseEntity {
    private String name;

    public Specialty() {
    }

    public Specialty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
