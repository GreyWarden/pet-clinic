package com.greywarden.petclinic.services;

import com.greywarden.petclinic.model.Vet;

import java.util.Set;

public interface VetRepository {
    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
}
