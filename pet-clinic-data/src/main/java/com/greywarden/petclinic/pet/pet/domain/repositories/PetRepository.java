package com.greywarden.petclinic.pet.pet.domain.repositories;

import com.greywarden.petclinic.pet.pet.domain.models.Pet;
import com.greywarden.petclinic.shared.domain.repositories.crud.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
