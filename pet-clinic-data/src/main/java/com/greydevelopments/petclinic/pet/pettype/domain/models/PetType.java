package com.greydevelopments.petclinic.pet.pettype.domain.models;

import com.greydevelopments.petclinic.shared.domain.models.base.BaseEntity;

public final class PetType extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
