package com.greywarden.petclinic.vet.specialty.domain.models;

import com.greywarden.petclinic.shared.domain.models.base.BaseEntity;

public final class Specialty extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
