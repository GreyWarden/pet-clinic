package com.greywarden.petclinic.services;

import com.greywarden.petclinic.model.Owner;

import java.util.Set;

public interface OwnerRepository {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
