package com.greywarden.petclinic.services;

import com.greywarden.petclinic.model.Pet;

import java.util.Set;

public interface PetRepository {
    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();
}
